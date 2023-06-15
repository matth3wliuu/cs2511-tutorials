package static_functions;

// ! PLEASE DO NOT HAVE MULTIPLE CLASSES IN THE SAME FILE
// ! THIS IS JUST A DEMO

// ? What is the output of executing A.f()?

class A {
    public static void f() {
        B b1 = new B();
        B b2 = new B();
        b1.incX();
        b2.incY();
        System.out.println(b1.getX() + " " + b1.getY());
        System.out.println(b2.getX() + " " + b2.getY());
    }
}

class B {
    private int x;
    private static int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incX() {
        x++;
    }

    public void incY() {
        y++;
    }
}