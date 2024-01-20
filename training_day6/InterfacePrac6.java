public class InterfacePrac6 implements It1 {

    public void m1() {
        System.out.println("Abstract method");
    }
    public static void main(String[] args) {
        InterfacePrac6 t = new InterfacePrac6();
        t.m1();
        t.m2();
        It1.m3();
    }
}

interface It1 {
    void m1();
    default void m2() {
        System.out.println("default method");
    }

    static void m3() {
        System.out.println("static method");
    }
}
