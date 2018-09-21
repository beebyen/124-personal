package warmUps;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 0; i < 31; i++) {
            for(int j = 0; j < 31; j++) {
                System.out.print(whiteSpace(i * j));
            }
            System.out.print("\n");

        }
    }

    public static String whiteSpace(int num) {
        if(num < 10) {
            return "   " + num;
        }
        if(num > 9 && num < 100) {
            return "  " + num;
        }

        return " " + num;
    }

}
