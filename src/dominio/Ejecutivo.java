/*
Ejecutivo.java
Clase para almacenar los datos correspondientes a los ejecutivos del negocio
 */

package dominio;

class Ejecutivo extends Empleado {
    
    private String cargo;

    public Ejecutivo(   String cargo, 
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
                "ejecutivoID", 
                "Ejecutivos");
        this.cargo = cargo;
    } 

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    public String getData () {
        String data;
        data = "(" +      getID() + ", " + 
                    "'" + getPASSWORD() + "' ," + 
                    "'" + getCedula() + "' ," +                    
                    "'" + getPrimerNombre() + "' ," + 
                    "'" + getPrimerApellido() + "' ," +
                    "'" + getDireccion() + "' ," +
                    "'" + getTelefono() + "' ," +
                    "'" + getCargo() + "' ," +
                    "'" + getFecha() + "' ," +
                        + getSalario() + ")" ;         
        
        return data;        
    }

    
}