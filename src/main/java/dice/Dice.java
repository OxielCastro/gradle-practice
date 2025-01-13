import java.util.Random;
class Dice {
    public int roll(int sides){
         Random random = new Random();
         int number = random.nextInt(1, sides);
         return number;
    }
}