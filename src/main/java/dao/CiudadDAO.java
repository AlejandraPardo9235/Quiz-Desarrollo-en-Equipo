import entidades.Ciudad;
import javax.persistence.EntityManager;

public class CiudadDoo extends GenericDAO<Ciudad> {
    private static final String[] CSV_FILE_PATHS = { "src/main/resources/ciudades.csv" };

    public CiudadDoo(EntityManager entityManager) {
        super(Ciudad.class, entityManager);
    }

    public void cargarCiudades() {
        // Invoca el método getAll para cargar todas las ciudades desde los archivos CSV en una única ejecución
        getAll(CSV_FILE_PATHS);
    }
}