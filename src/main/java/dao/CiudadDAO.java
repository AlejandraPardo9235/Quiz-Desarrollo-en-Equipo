
import entidades.Ciudad;
import java.util.List;

public class CiudadDAO extends GenericDAO<Ciudad> {
    private static final String FILE_PATH = "src/main/resources/ciudades.csv";

    public CiudadDAO() {
        super(Ciudad.class);
    }

    public List<Ciudad> getAllCiudades() {
        return getAll(FILE_PATH);
    }
}

