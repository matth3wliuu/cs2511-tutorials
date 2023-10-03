package lsp;

// ! For demonstration purposes. Do not declare multiple classes in the same file.

class SuperClass {
    /*
    * @precondition: 0 <= angle <= 180 degrees
    * @postcondition: 90 <= result <= 270 degrees
    */
    public double rotate(double angle) {
        return angle + 90;
    }
}

class SubClass extends SuperClass {
    /*
    * @precondition: 0 <= angle <= 90 degrees
    * @postcondition: 270 <= result <= 360 degrees
    */
    @Override
    public double rotate(double angle) {
        return angle + 270;
    }

    // ? What happened to the precondition?
    // * the subclass has reduced the precondition of the rotate method from 0-180 degrees to 0-90 degrees
    // * the subclasses allows less valid input than the superclass. So, users cannot use an instance of the sub class as an instance of the super class

    // ? What happend to the postcondition?
    // * the subclass has increased the postcondition of the roate method
    // * the subclass allows a larger range of values to be returned and they may not be handled by the caller

    // * users should be able to use an instance of the sub class in the same way that they can use an instance of the super class
}

public class Rotator {
    /*
    * @precondition: 90 <= angle <= 270 degrees
    */
    public void inspect(double angle) throws Exception {
        if (angle > 270 || angle < 90) {
            throw new Exception("angle must be at least 90 degrees and at most 270 degrees");
        }
        System.out.println(angle);
    }

    public static void main(String[] args) throws Exception {
        Rotator rotator = new Rotator();

        SuperClass sup = new SuperClass();
        SubClass sub = new SubClass();

        double angle = 90;

        double angle1 = sup.rotate(angle);
        double angle2 = sub.rotate(angle);

        // * By LSP, we should be able to pass both angle1 and angle2 without worries

        rotator.inspect(angle1);
        rotator.inspect(angle2);
    }
}
