package basicJava;

import java.util.Scanner;

public class LegalDriver {
    public static void main(String[] args) {
        System.out.println("What's your age?");
        Scanner hello = new Scanner(System.in);
        int age = hello.nextInt();
        System.out.println("Do you have a valid driver's license? (True or False)");
        boolean valid = hello.nextBoolean();

        if(age >= 18 && valid) {
            System.out.println("You're a valid driver!");
        }
        else {
            System.out.println("You're not allowed to drive!");
        }

    }

}
