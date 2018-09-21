package basicJava;

public class BasicStuff {
    public static void main(String[] args) {
        int age = 18;
        System.out.println("I am " + age + " years old!");
        double grade = 4.0;
        System.out.println("I want a " + grade + " 4.0 GPA");
        System.out.println(6 / 3);
        System.out.println(6 / 4);
        System.out.println((double)6 / 4);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1); //Very confused.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(calculate(1600));
        System.out.println(computeCone(2, 5));

  }
        private static String calculate(int hours) {
            int original = hours;
            int days = hours / 24;
            hours = hours % 24;
            int weeks = days / 7;
            days = days % 7;
            return original + " hours is " + weeks + " weeks, " + days + " days, and " + hours + " hours.";

            //return hours + " hours is" +
        }

        public static String computeCone(int r, int h) {
            double volume = Math.PI * r * 2 * (h / 3);
            double surfaceArea = Math.PI * r * 2 + Math.PI * r * Math.sqrt(r * 2 + h * 2);
            return "The volume of this cone is " + volume + " units and the surfaceArea is " + surfaceArea + " units.";
        }

}