import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository<T> {
    private final Class<T> type;

    protected BaseRepository(Class<T> type) {
        this.type = type;
    }

    public List<T> getAll(String filePath) {
        List<T> entities = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                T entity = createEntity(values);
                if (entity != null) {
                    entities.add(entity);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return entities;
    }

    private T createEntity(String[] values) {
        try {
            Constructor<T> constructor = type.getConstructor(int.class, String.class);
            Object[] parsedValues = parseValues(constructor.getParameterTypes(), values);
            return constructor.newInstance(parsedValues);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
    

    private Object[] parseValues(Class<?>[] parameterTypes, String[] values) {
        Object[] parsedValues = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i] == int.class) {
                parsedValues[i] = Integer.parseInt(values[i]);
            } else if (parameterTypes[i] == String.class) {
                parsedValues[i] = values[i];
            }
        }
        return parsedValues;
    }
}

