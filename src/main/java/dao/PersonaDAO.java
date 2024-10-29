
import entidades.Persona;
import java.util.List;

public class PersonaDAO extends GenericDAO<Persona> {
    private static final String FILE_PATH = "src/main/resources/personas.csv";

    public PersonaDAO() {
        super(Persona.class);
    }

    public List<Persona> getAllPersonas() {
        return getAll(FILE_PATH);
    }
}
