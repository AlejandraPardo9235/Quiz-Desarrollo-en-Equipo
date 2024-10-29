
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericDAO<T> {
    private Class<T> type;

    public GenericDAO(Class<T> type) {
        this.type = type;
    }

    public List<T> getAll(String filePath) {
        List<T> entities = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                T entity = createEntity(data);
                entities.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entities;
    }

    private T createEntity(String[] data) throws Exception {
        Constructor<T> constructor = type.getDeclaredConstructor();
        T entity = constructor.newInstance();

        Field[] fields = type.getDeclaredFields();
        for (int i = 0; i < fields.length && i < data.length; i++) {
            fields[i].setAccessible(true);
            if (fields[i].getType() == int.class) {
                fields[i].set(entity, Integer.parseInt(data[i]));
            } else if (fields[i].getType() == String.class) {
                fields[i].set(entity, data[i]);
            }
        }
        return entity;
    }
}

