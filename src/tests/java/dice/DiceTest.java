package dice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class DiceTest {

    @Test
    void checkDiceInRange() {
        Dice dice = new Dice();
        for (i = 0; i < 100; ++i) {
            int result = dice.roll(6);
            assertEquals(true, result<=6);
        }
    }


}