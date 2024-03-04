package lod;

// ! For demonstration purposes. Do not declare multiple classes in the same file.

class C {
    private int data;

    public C(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

class B {
    private C c;
    private String name;

    public B(C c, String name) {
        this.c = c;
        this.name = name;
    }

    public C getC() {
        return this.c;
    }

    public void shout() {
        System.out.println("My name is " + this.name);
    }

    public String getName() {
        return this.name;
    }
}

class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public void helloWorld() {
        System.out.println("Hello world");
    }

    public void shout() {
        b.shout();
    }

    public void showName(B b) {
        System.out.println(b.getName());
    }

    public void showData() {
        C c = b.getC();
        System.out.println(c.getData());
    }

    public static void main(String[] args) {
        C c = new C(42);
        B b = new B(c, "Matt");
        A a = new A(b);

        // ? does this violate the Law of Demeter
        a.helloWorld();

        // ? does this violate the Law of Demeter
        a.shout();

        // ? does this violate the Law of Demeter
        a.showData();

        // ? does this violate the Law of Demeter
        a.showName(b);
    }
}