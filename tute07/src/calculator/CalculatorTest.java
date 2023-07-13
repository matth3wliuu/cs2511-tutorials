package calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        // exp1 = 42
        Component exp1 = new Number(42);
        System.out.println(exp1.compute());

        // exp2 = 3 + 4
        Component left1 = new Number(3);
        Component right1 = new Number(4);

        Component exp2 = new Addition(left1, right1);
        System.out.println(exp2.compute());
    }
}
