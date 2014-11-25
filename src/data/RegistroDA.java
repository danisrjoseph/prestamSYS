/**
 * clase RegistroDA
 * @author DANIS-OFFICE
 */

package data;

import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
import vista.*;


public class RegistroDA {
    
    private static Connection con = null;    

    public static String consultarUsuario(int user, String pass, String tabla) {

        String nombre = verificarDatos(user, pass, tabla);
        if (nombre.equals("undefined")) {
            return "undefined";
        }
        return nombre;
    }

    // verificar datos de usuario
    public static String verificarDatos(int id, String password, String tabla) {

        Connexion connexion = new Connexion();
        String idUsuarioActual = "";
        con = connexion.conectarDB();
        ResultSet rs;
        ResultSetMetaData metaDatos;

        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT " + tabla + "ID FROM " + tabla + 's'
                    + " WHERE " + tabla + "ID = " + id + "AND password = " + "'" + password + "'");
            metaDatos = rs.getMetaData();
            while (rs.next()) {
                for (int i = 1; i <= metaDatos.getColumnCount(); ++i) {
                    idUsuarioActual += rs.getInt(i);
                }
            }
            rs.close();
            stmt.close();
            connexion.cerraCon();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
        return idUsuarioActual;
    }
    // verificar password de ejecutivo

    public static boolean veriPassEjec(String pass) {
        Connexion connexion = new Connexion();
        boolean existe = false;
        con = connexion.conectarDB();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT password FROM Ejecutivos"
                    + " WHERE  password = " + "'" + pass + "'");
            if (rs.next()) {
                existe = true;
            }
            rs.close();
            stmt.close();
            connexion.cerraCon();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }

        return existe;
    }

    public static void crearDB() {

        Connexion conn = new Connexion();
        File f = new File(".\\DB\\PrestaSYSDB");
        if (!f.exists()) {
            Object[] options = {"Si", "No"};
            int n = JOptionPane.showOptionDialog(null,
                    "!! Base de Datos No existente !!\nDesea Crearla ?",
                    "Advertencia!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);
            if (n == JOptionPane.OK_OPTION) { // Afirmative                
                con = conn.crearDB();                                
            }
            if (n == JOptionPane.NO_OPTION) { // negative
                System.exit(0);
            }
            if (n == JOptionPane.CLOSED_OPTION) { // closed the dialog
                System.exit(0);
            }                
        }
    }
    
    // metodo para insertar datos en la base de datos
    public static void insertarDatos(String tabla, String datos, int user, String pass) {
        con = (new Connexion()).conectarDB();
        try {
            PreparedStatement pstm = con.prepareStatement(datos);
            pstm.execute();
            pstm.close();
           JOptionPane.showMessageDialog(null,"Datos Insertados correctamente en la tabla " + tabla);
           if(tabla.equals("Agentes") || tabla.equals("Ejecutivos")){
               JOptionPane.showMessageDialog(null,"TOME NOTAS:\nUsuario: " + user + "\nContraseña: " + pass);
           }           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
    }
    // generar ID    
    public static int generarID (String tipoID, String tabla) {        
        
        int mayor = 0;
        int num = 0; 
        Connexion conexion = new Connexion();
        con = conexion.conectarDB(); 
        
        try {            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT " + tipoID + " FROM " + tabla );
            while(rs.next()){                
                num = rs.getInt(tipoID);               
                if( num > mayor){
                    mayor = num;
                }
            }       
            rs.close();
            stmt.close();
            conexion.cerraCon();            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
        if (mayor == 0) {
            mayor = 2000;
        }
        return mayor + 1;
    }
}
