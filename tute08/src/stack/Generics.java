package stack;

class NoGenerics {
    public static void printString(String s) {
        System.out.println(s);
    }

    public static void printInt(int i) {
        System.out.println(i);
    }

    public static void printDouble(double d) {
        System.out.println(d);
    }

    public static void main(String[] args) {
        String str = "hello";
        int x = 5;
        double y = 42.0;

        NoGenerics.printString(str);
        NoGenerics.printInt(x);
        NoGenerics.printDouble(y);
    }
}

class Generics {
    public static <T> void print(T t) {
        System.out.println(t.toString());
    }

    public static void main(String[] args) {
        String str = "hello";
        int x = 5;
        double y = 42.0;

        // * Implement once and reuseable with different types
        print(str);
        print(x);
        print(y);
    }
}
