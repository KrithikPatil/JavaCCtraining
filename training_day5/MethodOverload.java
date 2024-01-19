public class MethodOverload {
    public static void main(String[] args) {
        Test t = new Test();
        t.add(35);
        t.add(35, 50);
        t.add(67, 23, 45);
    }
}

class Test {
    public void add(int a) {
        System.out.println(a + a);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
