package activityStarterCode.BasicClasses;

import java.util.Random;

public class RandomWalk {
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
        // TODO: update the value randomly, either +1 or -1
        if(rng.nextBoolean()) {
            walkValue++;
        }
        else {
            walkValue--;
        }
        return getValue();
    }
}

