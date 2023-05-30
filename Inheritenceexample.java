class A {
    public A() {
        System.out.println("Super class");
    }

    public A(int a) {
        System.out.println("Super class with parameter");
    }
}

class B extends A {
    public B() {
        System.out.println("Base class");
    }

    public B(int a) {
        this();
        System.out.println("Base class with parameter");
    }
}

public class Inheritenceexample {
    public static void main(String args[]) {
        B c = new B(5);
    }
}
