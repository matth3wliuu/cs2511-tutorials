package calculator;

public class Number implements Component {
    private double number;

    public Number(double number) {
        this.number = number;
    }

    public double compute() {
        return this.number;
    }
}
