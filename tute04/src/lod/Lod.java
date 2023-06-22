package lod;

// * NOTE: this class conforms to LOD
class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public void func1() {
        System.out.println("Hey there from A !");
    }

    public String getName() {
        return this.name;
    }
}

// * NOTE: this class conforms to LOD
class B {
    private A a;

    // ? Do I need a constructor?

    public void func1() {
        System.out.println("Hey there from B");
    }

    public void func2() {
        a.func1();
    }

    public A getA() {
        return this.a;
    }
}

class C {
    private B b;

    public void func1() {
        System.out.println("Hey there from C!");
    }

    // ? Does this break LOD?
    public void func2(A a) {
        func1();
        System.out.println(a.getName());
    }

    // ? Does this break LOD?
    public void func3() {
        A a2 = new A("Bob");
        a2.func1();

        this.b.getA().func1();
    }
}
