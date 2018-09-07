package Homework;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Put in a positive number.");
        int n = reader.nextInt();
        reader.close();
        System.out.println(Math.random()* n);
    }
}
