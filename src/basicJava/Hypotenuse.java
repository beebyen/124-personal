package basicJava;

public class Hypotenuse {
    public static void main(String[] args) {
        Hypotenuse hello = new Hypotenuse(12, 13);
        hello.calculate();
    }
        private int side1;
        private int side2;

    public Hypotenuse(int input1, int input2){
            side1 = input1;
            side2 = input2;
    }

    public double calculate() {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
