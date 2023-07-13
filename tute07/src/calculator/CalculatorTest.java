package calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Component exp1 = new Number(42);
        System.out.println(exp1.compute());

        Component exp2 = new Division(new Number(10), new Number(5));
        System.out.println(exp2.compute());


        // exp1 = 42
        // exp2 = 10 / 5
        // exp3 = ((1 + 2) + (10 / 5)) - ((3 - 4) * (2))
    }
}
