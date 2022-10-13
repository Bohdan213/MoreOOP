package lotr;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    public static Character createCharacter() {
        Reflections reflections = new Reflections(Character.class.getPackage().getName());
        Set<Class<?>> factory = reflections.get(SubTypes.of(Character.class).asClass());
        factory.remove(Noble.class);
        int number = new Random().nextInt(4);
        try {
            return (lotr.Character) factory.toArray(new Class[0])[number].getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}