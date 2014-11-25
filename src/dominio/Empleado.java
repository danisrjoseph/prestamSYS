/*
Empleado.java
Clase abstracta, tiene los datos comunes a todos los empeados (Agentes y ejecutivos)
 */

package dominio;

abstract class Empleado extends Persona {
    
    private String PASSWORD;
    private double salario;

    public Empleado(String PASSWORD, 
                    double salario, 
                    String cedula, 
                    String primerNombre, 
                    String primerApellido, 
                    String direccion, 
                    String telefono, 
                    String tipoID, 
                    String tabla) {
        super(  cedula, primerNombre, 
                primerApellido, 
                direccion, 
                telefono, 
                tipoID, 
                tabla);
        this.PASSWORD = PASSWORD;
        this.salario = salario;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
}
