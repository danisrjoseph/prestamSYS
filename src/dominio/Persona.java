/*
 * Persona.java
 * Clase abstracta, tiene los datos genericos de todos las personas relacionadas
 * con el negocio
 */

package dominio;

abstract class Persona extends Registro {
    private String cedula;
    private String primerNombre;
    private String primerApellido;
    private String direccion;
    private String telefono;    

    public Persona( String cedula, 
                    String primerNombre, 
                    String primerApellido, 
                    String direccion, 
                    String telefono, 
                    String tipoID, 
                    String tabla) {
        super(tipoID, tabla);
        this.cedula = cedula;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    protected String getCedula() {
        return cedula;
    }

    protected void setCedula(String cedula) {
        this.cedula = cedula;
    }

    protected String getPrimerNombre() {
        return primerNombre;
    }

    protected void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    protected String getPrimerApellido() {
        return primerApellido;
    }

    protected void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    protected String getDireccion() {
        return direccion;
    }

    protected void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    protected String getTelefono() {
        return telefono;
    }

    protected void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
