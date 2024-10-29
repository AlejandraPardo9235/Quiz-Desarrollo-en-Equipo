package main;
import dao.CiudadDAO;
import dao.PersonaDAO;
import entidades.Ciudad;
import entidades.Persona;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CiudadDAO ciudadDAO = new CiudadDAO();
        PersonaDAO personaDAO = new PersonaDAO();

        System.out.println("Ciudades:");
        List<Ciudad> ciudades = ciudadDAO.getAllCiudades();
        ciudades.forEach(System.out::println);

        System.out.println("\nPersonas:");
        List<Persona> personas = personaDAO.getAllPersonas();
        personas.forEach(System.out::println);
    }
}
