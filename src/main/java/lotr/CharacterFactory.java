package lotr;
import java.util.Random;

public class CharacterFactory {
    public static Character createCharacter() {
        int number = new Random().nextInt(4);
        if (number == 0) {
            return new Hobbit();
        }
        if (number == 1) {
            return new Elf();
        }
        if (number == 2) {
            return new King();
        }
        return new Knight();
    }
}