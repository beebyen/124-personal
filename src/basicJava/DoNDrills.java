package basicJava;

import java.util.Scanner;

public class DoNDrills {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 32; i > 0 ; i /= 2) {
            System.out.println(i);
        }

//checkerboard!!

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 9; c++) {
                if((r + c) % 2 == 0) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        Scanner input = new Scanner(System.in);
        System.out.println("How tall do you want your pyramid to be?");
        int height = input.nextInt();
        while(height > 0) {
            System.out.println("*");
            height--;
        }
    }
}

