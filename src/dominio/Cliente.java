/*
Cliente.java
Clase para gestionar los datos correspondientes a los clientes del negocio
 */

package dominio;

class Cliente extends Persona {
    
    private boolean activo;
    private double ingresosMensual;

    public Cliente( double ingresosMensual,
                    String cedula, 
                    String primerNombre, 
                    String primerApellido, 
                    String direccion, 
                    String telefono ) {
        super(  cedula, 
                primerNombre, 
                primerApellido, 
                direccion, 
                telefono, 
                "clienteID", 
                "Clientes");
        this.activo = false;
        this.ingresosMensual = ingresosMensual;
    }
    
    // setter y getter
    public boolean isActivo() {
        return activo;
    }
    
    public String getActivo(){
        if(isActivo())
            return "SI";
        else
            return "NO";
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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
                        + getIngresosMensual() + "," +
                    "'" + getActivo() + "'" + ")" ;        
        
        return data;        
    }
    
}
