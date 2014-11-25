/*
clase Controladora RegistrarPersona 
caso de Uso CU101: Registrar Persona
@author DANIS-OFFICE
 */

package dominio;

import data.RegistroDA;

public class RegistrarPersona {
    // registrar cliente
    public static void registrarCliente (double ingresosMensual,
            String cedula,
            String primerNombre,
            String primerApellido,
            String direccion,
            String telefono) { 
        
        Cliente c = new Cliente(ingresosMensual,
                cortarString(cedula, 15),
                cortarString(primerNombre, 19),
                cortarString(primerApellido, 19),
                cortarString(direccion, 29),
                cortarString(telefono, 14));
        c.poblarDB("Clientes", c.getData());
    }
    // registrar garante
    public static void registrarGarante (double ingresosMensual,
            String cedula,
            String primerNombre,
            String primerApellido,
            String direccion,
            String telefono) {

        Garante g = new Garante(ingresosMensual,
                cortarString(cedula, 15),
                cortarString(primerNombre, 19),
                cortarString(primerApellido, 19),
                cortarString(direccion, 29),
                cortarString(telefono, 14));
        g.poblarDB("Garantes", g.getData());
    }
    // registrar agente
    public static void registrarAgente(String horario,
            String PASSWORD,
            double salario,
            String cedula, 
                    String primerNombre, 
                    String primerApellido, 
                    String direccion, 
                    String telefono) { 
        
        Agente a = new Agente(cortarString(horario, 14),
                PASSWORD, salario,
                cortarString(cedula, 15),
                cortarString(primerNombre, 19),
                cortarString(primerApellido, 19),
                cortarString(direccion, 29),
                cortarString(telefono, 14));
        a.poblarDB("Agentes", a.getData());
    }
    // registrar ejecutivo
    public static void registrarEjecutivo (String cargo, 
                    String PASSWORD, 
                    double salario, 
                    String cedula, 
                    String primerNombre, 
                    String primerApellido, 
                    String direccion, 
                    String telefono) { 
        
        Ejecutivo e = new Ejecutivo(cortarString(cargo, 15),
                PASSWORD, salario,
                cortarString(cedula, 15),
                cortarString(primerNombre, 19),
                cortarString(primerApellido, 19),
                cortarString(direccion, 29),
                cortarString(telefono, 14));
        e.poblarDB("Ejecutivos", e.getData());
    }

    // cortar string muy largos    
    public static String cortarString(String cadena, int tamanio) {        
        
        char[] ca = new char[tamanio];        
        String cad = "";
        String retorno;
        
        for (int i =0; i < tamanio; ++i) {
            if (cadena.length() > tamanio)
                ca[i] = cadena.charAt(i);  
        }
        
        for (int i =0; i < tamanio; ++i) {
            if (cadena.length() > tamanio)
               cad += ca[i];                    
        }
        
        if (cadena.length() > tamanio) {
               retorno = cad;
        } else { retorno = cadena; }
        
        return retorno;
        
    }// fin cortarString
    
    public static boolean verificarPassEjecutivo(String pass) {
        
        if (RegistroDA.veriPassEjec(pass)) {
            return true;
        }
        return false;
    }
}
