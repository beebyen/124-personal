package basicJava;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner assignments = new Scanner(System.in);
        System.out.println("How many assignments are you entering?");
        int num = assignments.nextInt();
        int total = 0;
        for(int i = 0; i < num; i++) {
            System.out.println("Enter your assignment grade (number out of 100):");
            total += assignments.nextInt();
        }

        double average = (total / num);

        if(average >= 90) {
            System.out.println("You get an A!");
        }
        else if(average >= 80) {
            System.out.println("You get a B!");
        }
        else if(average >= 70) {
            System.out.println("You get a C!");
        }
        else if(average >= 60) {
            System.out.println("You get a D!");
        }
        else {
            System.out.println("Sorry, you fail.");
        }



    }
}
