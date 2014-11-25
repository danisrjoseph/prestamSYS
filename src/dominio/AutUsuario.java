/**
 * clase Controladora AutUsuario 
 * caso de Uso CU100: Autentificar usuario
 * @author DANIS-OFFICE
 */

package dominio;

import data.RegistroDA;


public class AutUsuario {

    public static String obtenerAcceso(String user, String pass, Object e) {
        
        String tabla = String.valueOf(e);
        String idUsuarioActual = RegistroDA.consultarUsuario(Integer.parseInt(user), pass, tabla);
        if (idUsuarioActual.equals("undefined")) {
            return "undefined";
        }
        return idUsuarioActual;
    }

    public static void crearDB() {
        Registro.crearDB();
    }
}
