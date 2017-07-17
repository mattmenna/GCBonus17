/**
 * Created by Matt on 7/17/2017.
 */
public class Warrior extends GameCharacter {
    private String weaponType;


    @Override
    public void play() {
        characterType = "Warrior";
        super.play();
        System.out.println("Weapon for " + characterType + " : ");
        setWeaponType(scnr.nextLine());
        System.out.println("Weapon Type : " + weaponType);
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
}
