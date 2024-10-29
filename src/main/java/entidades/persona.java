package main.java.entidades;

public class persona {
    
    private int idPersona;
    private String nombre;

    // Constructor
    public persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{idPersona=" + idPersona + ", nombre='" + nombre + "'}";
    }

}
