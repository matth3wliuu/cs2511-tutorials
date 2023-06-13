package static_functions;

// ! PLEASE DO NOT HAVE MULTIPLE CLASSES IN THE SAME FILE
// ! THIS IS JUST A DEMO

// ? Q1: Can you override a static method in Java?

// ? Q2: What is the output of executing A.f()?

class A {
    public static void f() {
        C c = new C();
        c.speak();
        B b = c;
        b.speak();
        b = new B();
        b.speak();
        c.speak();
    }
}

class B {
    public void speak() {
        System.out.println("moo");
    }

}

class C extends B {
    public void speak() {
        System.out.println("quack");
    }
}

public class Statics1 {

    public static void main(String[] args) {
        A.f();
    }
}