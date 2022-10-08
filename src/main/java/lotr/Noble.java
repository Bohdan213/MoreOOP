package lotr;
import java.util.Random;

abstract public class Noble extends lotr.Character{
    public Noble(int min, int max) {
        super(new Random().nextInt(10) + 5, new Random().nextInt(10) + 5);
    }
    private final static Random randomGenerator = new Random();

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - randomGenerator.nextInt(getPower()  + 1));
    }
}
