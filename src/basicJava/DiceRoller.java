package basicJava;

import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random rng = new Random();

        int count = 0;
        int accum = 0;
        while(accum < 40) {
            count = count++;
           accum = accum + rng.nextInt(6) + 1;
        }
        System.out.println("count: " + count + " accum: " + accum);
    }
}
