/**
 * clase Conectdb: para conectar a la base de datos
 * @author DANIS-OFFICE
 */
package data;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.Loading;

public class Connexion {
//variables miembro 
    private Connection conn = null;
    Hilo h = new Hilo();
    public static class Hilo extends Thread {
        Loading load = new Loading();
        public void run(){
            load.setVisible(true);
        } 
        public void closeLoading(){
            load.dispose();
        }
        public void restartLoading(){
            load.setVisible(true);
        }
    }  

    public Connection crearDB() {        
        h.start();                    
        try {
            //obtenemos el driver de para mysql
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //obtenemos la conexión
            conn = DriverManager.getConnection("jdbc:derby:.\\DB\\PrestaSYSDB;create=true");
            if (conn != null) {
                h.closeLoading();
                JOptionPane.showMessageDialog(null, "OK\nBase de Datos lista");
                // creando las tablas
                h.restartLoading();
                String crearTablaClientes = "CREATE TABLE Clientes\n"
                        + "( clienteID INTEGER NOT NULL PRIMARY KEY,\n"
                        + "  cedula VARCHAR(15) NOT NULL, \n"
                        + "  primerNombre VARCHAR(20) NOT NULL,\n"
                        + "  primerApellido VARCHAR(20) NOT NULL,\n"
                        + "  direccion VARCHAR(30) NOT NULL,\n"
                        + "  telefono VARCHAR(14) NOT NULL, \n"
                        + "  fecha VARCHAR(23) NOT NULL, \n"
                        + "  ingresosMensual DECIMAL(10,2) NOT NULL, \n"
                        + "  activo VARCHAR(4) NOT NULL \n"
                        + ")";
                String crearTablaGarantes = "CREATE TABLE Garantes\n"
                        + "( garanteID INTEGER NOT NULL PRIMARY KEY,\n"
                        + "  cedula VARCHAR(15) NOT NULL,\n"
                        + "  primerNombre VARCHAR(20) NOT NULL, \n"
                        + "  primerApellido VARCHAR(20) NOT NULL,\n"
                        + "  direccion VARCHAR(30) NOT NULL,\n"
                        + "  telefono VARCHAR(14) NOT NULL,\n"
                        + "  fecha VARCHAR(23) NOT NULL, \n"
                        + "  ingresosMensual DECIMAL(10,2) NOT NULL \n"
                        + ")";
                String crearTablaAgentes = "CREATE TABLE Agentes\n"
                        + "( agenteID INTEGER NOT NULL PRIMARY KEY,\n"
                        + "  password VARCHAR(10) NOT NULL, \n"
                        + "  cedula VARCHAR(15) NOT NULL, \n"
                        + "  primerNombre VARCHAR(20) NOT NULL,\n"
                        + "  primerApellido VARCHAR(20) NOT NULL,\n"
                        + "  direccion VARCHAR(30) NOT NULL, \n"
                        + "  telefono VARCHAR(14) NOT NULL, \n"
                        + "  horario VARCHAR(15) NOT NULL, \n"
                        + "  fecha VARCHAR(23) NOT NULL, \n"
                        + "  salario DECIMAL(10,2) \n"
                        + ")";
                String crearTablaEjecutivos = "CREATE TABLE Ejecutivos\n"
                        + "( ejecutivoID INTEGER NOT NULL PRIMARY KEY,\n"
                        + "  password VARCHAR(10) NOT NULL, \n"
                        + "  cedula VARCHAR(15) NOT NULL, \n"
                        + "  primerNombre VARCHAR(20) NOT NULL,\n"
                        + "  primerApellido VARCHAR(20) NOT NULL, \n"
                        + "  direccion VARCHAR(30) NOT NULL,\n"
                        + "  telefono VARCHAR(14) NOT NULL, \n"
                        + "  cargo VARCHAR(15) NOT NULL, \n"
                        + "  fecha VARCHAR(23) NOT NULL, \n"
                        + "  salario DECIMAL(10,2) \n"
                        + ")";                
                try {
                    PreparedStatement pstm1 = conn.prepareStatement(crearTablaClientes);
                    pstm1.execute();
                    pstm1.close();
                    
                    PreparedStatement pstm2 = conn.prepareStatement(crearTablaGarantes);
                    pstm2.execute();
                    pstm2.close();
                    
                    PreparedStatement pstm3 = conn.prepareStatement(crearTablaAgentes);
                    pstm3.execute();
                    pstm3.close();
                    
                    PreparedStatement pstm4 = conn.prepareStatement(crearTablaEjecutivos);
                    pstm4.execute();
                    pstm4.close();  
                    
                    h.closeLoading();
                    JOptionPane.showMessageDialog(null, "Tablas Creadas correctamente");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        h.stop();
        return conn;
    }

    public Connection conectarDB() {
        h.start();
        try {
            //obtenemos el driver de para mysql
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //obtenemos la conexión
            conn = DriverManager.getConnection("jdbc:derby:.\\DB\\PrestaSYSDB");
            if (conn != null) {
                //JOptionPane.showMessageDialog(null, "OK base de datos listo");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        h.closeLoading();
        h.stop();
        return conn;
    }

    public void cerraCon() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}