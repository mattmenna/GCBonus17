/**
 * Created by Matt on 7/17/2017.
 */
public abstract class GameCharacter {
    private String name;
    private int strength;
    private int intelligence;

    public GameCharacter() {
    }

    public void play() {
        System.out.println("Name :" + name);
        System.out.println("Strength : " + strength + "\n" + "Intelligence : " + intelligence);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
