public class VarArg3 {

    public void m1(int... a) {
        System.out.println("Variable arguement");
    }

    public void m1(int a) {
        System.out.println("Normal arguement");
    }
    public static void main(String[] args) {
        VarArg3 v = new VarArg3();

        v.m1(10);
    }
}
