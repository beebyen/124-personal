package basicJava;

import java.util.Scanner;

public class SquareNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Insert a number.");
            num = input.nextInt();
            System.out.println(Math.pow(num, 2));
        } while (Math.pow(num, 2) % 4 != 0);
    }

}


