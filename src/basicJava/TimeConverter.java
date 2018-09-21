package basicJava;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println(time(7, 3, 2) + " seconds");
    }

    public static int time(int hours, int mins, int sec) {
        int sum = 0;
        sum += (hours * 60 * 60);
        sum += (mins * 60);
        sum += sec;
        return sum;
    }

}
