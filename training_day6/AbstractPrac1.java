public class AbstractPrac1 extends Test {

    void m1() {
        System.out.println("m1 abstract method");
    }

    void m2() {
        System.out.println("m2 abstract method");
    }

    void m3() {
        System.out.println("m3 abstract method");
    }
    public static void main(String[] args) {
        AbstractPrac1 a = new AbstractPrac1();
        a.m1(); a.m2();
        a.m3(); a.m4();

        Test t1 = new AbstractPrac1();
        t1.m1(); t1.m2();
        t1.m3(); t1.m4();
    }
}

abstract class Test {
    abstract void m1();
    abstract void m2();
    abstract void m3();

    void m4() {
        System.out.println("m4 abstract method");
    }
}
