package BasicClasses;

import java.util.Random;

public class RandomWalk {
    public final static int MAX = 255;
    public final static int MIN = 0;
    private Random rng;
    private int walkValue;

    public RandomWalk(int walk) {
        rng = new Random();
        walkValue = walk;
    }

    public int getValue() {
        return walkValue;
    }

    public int advanceValue() {
        if(rng.nextBoolean() && walkValue < MAX) {
            walkValue++;
        }
        if(!rng.nextBoolean() && walkValue > MIN) {
            walkValue--;
        }
        return getValue();
    }
}

