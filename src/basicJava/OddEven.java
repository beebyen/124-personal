package basicJava;

import java.util.Scanner;

public class OddEven {

    public static boolean isAGoodBoy(int dog) {
        System.out.println("of course it is."); //side-effects, it prints something even if it's just in a condition ughhh
        return true;
    }

    public static void main(String[] args) {
        Scanner scoobieDoo = new Scanner(System.in);

        System.out.println("numbers, what up!");
        System.out.print(">> ");
        int dog = scoobieDoo.nextInt();
        boolean isEven = dog % 2 == 0;

        if(dog % 3 == 0 && isAGoodBoy(dog)) {
            System.out.println("that's an even dog");
        }
        else {
            System.out.println("that's an odd dog");
        }
    }
}
