package basicJava;

public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 2; i < 11; i++) {
            sum += 1.0 / i;
        }
        System.out.print(sum);
    }
}
