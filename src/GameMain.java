import java.util.ArrayList;

/**
 * Created by Matt on 7/17/2017.
 */
public class GameMain {

    public static void main(String[] args) {

        GameCharacter[] gameCharacters = new GameCharacter[5];
        gameCharacters[0] = new Warrior();
        gameCharacters[1] = new Warrior();
        gameCharacters[2] = new Wizard();
        gameCharacters[3] = new Wizard();
        gameCharacters[4] = new Wizard();

        for (int i = 0; i < gameCharacters.length; i++) {
            gameCharacters[i].play();
            System.out.println();
        }
    }

}