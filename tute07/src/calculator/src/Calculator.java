public class Calculator {

    public Calculator() {
    }

    public double calculate() {
        return 0.0;
    }


    public static void main(String[] args) {
        Expression three = new Number(3);
        Expression two = new Number(2);
        Expression seven = new Number(7);

        Expression times = new Multiplication(two, seven);
        Expression add = new Addition(three, times);

        System.out.println(add.compute());
    }
}
