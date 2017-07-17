/**
 * Created by Matt on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter {
    private int magicalEnergy;

    @Override
    public void play() {
        super.play();
        setMagicalEnergy(rand.nextInt());
        System.out.println("Magical Energy : " + magicalEnergy);

    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }
}
