package lotr;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    public static Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<?>> factory = reflections.get(SubTypes.of(Character.class).asClass());
        factory.remove(Noble.class);
        int number = new Random().nextInt(4);
        try {
            return (Character) factory.toArray(new Class[0])[number].getConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}