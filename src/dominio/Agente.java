/*
AgenteDeCredito.java
Clase para almacenar los datos referentes a los agentes de credito 
 */


package dominio;

class Agente extends Empleado {
    
    private String horario;
    // constructor
    public Agente(  String horario, 
                    String PASSWORD, 
                    double salario, 
                    String cedula, 
                    String primerNombre, 
                    String primerApellido, 
                    String direccion, 
                    String telefono ) {
        super(  PASSWORD, 
                salario, 
                cedula, 
                primerNombre, 
                primerApellido, 
                direccion, 
                telefono, 
                "agenteID", 
                "Agentes");
        this.horario = horario;
    }
    
    // setter y getter
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    // metodo sobrecargado de la clase Registro
    public String getData () {
        String data;
        data = "(" +      getID() + ", " + 
                    "'" + getPASSWORD() + "' ," + 
                    "'" + getCedula() + "' ," +                    
                    "'" + getPrimerNombre() + "' ," + 
                    "'" + getPrimerApellido() + "' ," +
                    "'" + getDireccion() + "' ," +
                    "'" + getTelefono() + "' ," +
                    "'" + getHorario() + "' ," +
                    "'" + getFecha() + "' ," +
                        + getSalario() + ")" ;        
        
        return data;        
    }   
    
}
