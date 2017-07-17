import java.util.Random;
import java.util.Scanner;

/**
 * Created by Matt on 7/17/2017.
 */
public abstract class GameCharacter {
    private String name;
    private int strength;
    private int intelligence;
    public Scanner scnr = new Scanner(System.in);
    public Random rand = new Random();

    public GameCharacter() {
        setName(scnr.nextLine());
        setIntelligence(rand.nextInt());
        setStrength(rand.nextInt());
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
