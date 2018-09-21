package warmUps;

import java.util.Scanner;

public class RepeatPhrase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many times?");
        int num = input.nextInt();
        input.nextLine(); //otherwise empty input??
        System.out.println("What phrase should I print?");
        String phrase = input.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println(phrase);

        }

    }

}
