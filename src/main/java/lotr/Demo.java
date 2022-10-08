package lotr;

public class Demo {
    public static void main(String[] args) {
        Character newCharacter1 = CharacterFactory.createCharacter();
        Character newCharacter2 = CharacterFactory.createCharacter();
        GameManager fight = new GameManager();
        fight.fight(newCharacter1, newCharacter2);
    }
}