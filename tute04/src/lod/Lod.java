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

    // * Class B holds an instance of C via composition
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
    // * the class B is a friend or a neighbour of the class A
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
        // * this line follows LOD because we can call methods from
        // * b because it is a friend
        C c = b.getC();

        // ! this violates the law of Demeter because C is not a friend of A
        System.out.println(c.getData());
    }

    public static void main(String[] args) {
        C c = new C(42);
        B b = new B(c, "Matt");
        A a = new A(b);

        // ? does this violate the Law of Demeter
        // * No it does not because it is method does exist in the class itself
        a.helloWorld();

        // ? does this violate the Law of Demeter
        // * No it does not because `b` is member variable of the class A.
        a.shout();

        // ? does this violate the Law of Demeter
        // * Yes it does as mentioned above
        a.showData();

        // ? does this violate the Law of Demeter
        // * No it does not because we can call methods from objects passed in as an argument
        a.showName(b);
    }
}