package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c1.getClass().getName() + " kick " + c2.getClass().getName());
            if (c2.isAlive()) {
                c2.kick(c1);
                System.out.println(c1.getClass().getName() + " kick " + c2.getClass().getName());
            }
            System.out.println(c1.toString());
            System.out.println(c2.toString());
        }
        if (!c1.isAlive()) {
            System.out.println(c1.getClass().getName() + " is dead");
        }
        else {
            System.out.println(c2.getClass().getName() + " is dead");
        }
    }
}
