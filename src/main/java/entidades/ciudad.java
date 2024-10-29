package main.java.entidades;


public class ciudad {  // Asegúrate de que el nombre de la clase comienza con mayúscula
    
    private int idCiudad;
    private String nombre;

    // Constructor
    public ciudad(int idCiudad, String nombre) {  // El constructor ahora coincide con el nombre de la clase
        this.idCiudad = idCiudad;
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{idCiudad=" + idCiudad + ", nombre='" + nombre + "'}";
    }
}



