/**
 * Created by Matt on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {
    private int spellNumber;

    @Override
    public void play() {
        super.play();
        setSpellNumber(rand.nextInt());
        System.out.println("Spellnumber " + spellNumber);
    }

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }
}
