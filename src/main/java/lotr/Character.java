package lotr;
import lombok.*;

@Getter
abstract public class Character {
    public int power;

    public void setPower(int power) {
        this.power = Math.max(power, 0);
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public int hp;
//    private BasicKick kick;
    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
//        this.kick = kick;
    }
    public abstract void kick(Character c);
    public boolean isAlive() {
        return getHp() > 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() +"{hp=" + this.hp
                + ", power=" + this.power + "}";
    }
}
