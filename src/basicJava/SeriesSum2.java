package basicJava;

public class SeriesSum2 {
    public static void main(String[] args) {
        double sum = 0.0;
        int count = 1;
        while (sum < 2) {
            sum += 1.0 / (count + 1);
            count++;
        }
        System.out.print(count);
    }
}
