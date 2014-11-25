/*
 Registro.java
 Clase abstracta, contiene los atributos comunes a todos las clases del sistema que necesitan
 persistencia, asi que los metodos necesarios para llevar a cabo operaciones comunes de registro,
 lectura, modificacion, y borrado de los objetos guardados en la base de datos
 */
package dominio;

import data.RegistroDA;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Registro {

    // Encapsulacion        

    private int ID;
    private String fecha;
    // atributos adicionales para la gestion de la conexion a la base de datos    
    private String tipoID;
    private String tabla;

    // constructor
    public Registro(String tipoID, String tabla) {
        this.tipoID = tipoID;
        this.tabla = tabla;
        this.ID = setID();
        this.fecha = obtenerFechaActual();
    }

    protected int getID() {
        return ID;
    }

    protected int setID() {
        return RegistroDA.generarID(this.tipoID, this.tabla);
    }

    protected String getFecha() {
        return fecha;
    }

    protected void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //**************PROTOTIPOS*DE*METODOS*A*SER*SOBREESCRITOS***************
    protected abstract String getData();

    //***************************METODOS*PRIVADOS**************************
    // obtener hora actual del sistema    
    private String obtenerFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat(" dd-MM-yyyy  hh:mm aaa");
        return formateador.format(ahora);
    }
    // poblar la base de datos

    protected void poblarDB(String tabla, String data) {
        String datos;
        int user = 0;
        String pass = "************";

        // insertando cliente
        if (tabla.equals("Clientes")) {
            datos = "INSERT INTO Clientes "
                    + "( clienteID, "
                    + "   cedula, "
                    + "   primerNombre, "
                    + "   primerApellido, "
                    + "   direccion, "
                    + "   telefono, "
                    + "   fecha, "
                    + "   ingresosMensual, activo )"
                    + "VALUES" + data;
            // Enviando datos
            RegistroDA.insertarDatos(tabla, datos, user, pass);
        }
        // insertando garante
        if (tabla.equals("Garantes")) {
            datos = "INSERT INTO Garantes "
                    + "( garanteID, "
                    + "   cedula, "
                    + "   primerNombre, "
                    + "   primerApellido, "
                    + "   direccion, "
                    + "   telefono, "
                    + "   fecha, "
                    + "   ingresosMensual )"
                    + "VALUES" + data;
            // Enviando datos
            RegistroDA.insertarDatos(tabla, datos, user, pass);
        }
        // insertando agente
        if (tabla.equals("Agentes")) {
            datos = "INSERT INTO Agentes "
                    + "( agenteID, "
                    + "   password, "
                    + "   cedula, "
                    + "   primerNombre, "
                    + "   primerApellido, "
                    + "   direccion, "
                    + "   telefono, "
                    + "   horario, "
                    + "   fecha, "
                    + "   salario )"
                    + "VALUES" + data;
            user = this.getID();
            // Enviando datos
            RegistroDA.insertarDatos(tabla, datos, user, pass);
        }
        // insertando agente
        if (tabla.equals("Ejecutivos")) {
            datos = "INSERT INTO Ejecutivos "
                    + "( ejecutivoID, "
                    + "   password, "
                    + "   cedula, "
                    + "   primerNombre, "
                    + "   primerApellido, "
                    + "   direccion, "
                    + "   telefono, "
                    + "   cargo, "
                    + "   fecha, "
                    + "   salario )"
                    + "VALUES" + data;
            user = this.getID();
            // Enviando datos
            RegistroDA.insertarDatos(tabla, datos, user, pass);
        }

        /*
        
         if (tabla.equals("Prestamos")) {
         stmt.execute("INSERT INTO Prestamos "
         + "(  prestamoID, "
         + "   clienteID, "
         + "   garanteID, "
         + "   gestionadorID, "
         + "   tipoGestionador, "
         + "   monto, tasa, tipo, "
         + "   montoCuota, numCuotas, "
         + "   cuotasPendientes,  "
         + "   montoPendiente, fecha )"
         + "VALUES"
         + data);
         }

        
         if (tabla.equals("Cobros")) {
         stmt.execute("INSERT INTO Cobros "
         + "(  cobroID, "
         + "   prestamoID, "
         + "   cobradorID, "
         + "   tipoCobrador, "
         + "   monto,   fecha )"
         + "VALUES"
         + data);
         }

         try {


         // LIBERANDO RECURSOS 
         conn.close();
         // APAGADO DE LA BASE DE DATOS
         // ...
         Auxiliar.centralizar("Datos insertados correctamente en la TABLA " + tabla );
         } catch (Exception e) {
         e.printStackTrace();
         }*/
    } // FIN METODO POBLAR LA BASE DE DATOS

    static void crearDB() {
        RegistroDA.crearDB(); //To change body of generated methods, choose Tools | Templates.
    }

}
