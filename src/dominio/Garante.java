/*
Garante.java
Clase concreta, almacena los datos de los garantes de clientes candidatos a obtener un prestamo
 */

package dominio;

class Garante extends Persona {
    
    private double ingresosMensual;

    public Garante( double ingresosMensual, 
                    String cedula, 
                    String primerNombre, 
                    String primerApellido, 
                    String direccion, 
                    String telefono) {
        super(  cedula, 
                primerNombre, 
                primerApellido, 
                direccion, 
                telefono, 
                "garanteID", 
                "Garantes");
        this.ingresosMensual = ingresosMensual;
    }

    public double getIngresosMensual() {
        return ingresosMensual;
    }

    public void setIngresosMensual(double ingresosMensual) {
        this.ingresosMensual = ingresosMensual;
    }
    
    public String getData () {
        String data;
        data = "(" +      getID() + ", " +                     
                    "'" + getCedula() + "' ," +                    
                    "'" + getPrimerNombre() + "' ," + 
                    "'" + getPrimerApellido() + "' ," +
                    "'" + getDireccion() + "' ," +
                    "'" + getTelefono() + "' ," +                   
                    "'" + getFecha() + "' ," +
                        + getIngresosMensual() + ")" ;               
        
        return data;        
    }    
   
    
}
