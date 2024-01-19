import java.util.Arrays;

public class VarArg1 {

    void m1(int... n) {
        System.out.println(Arrays.toString(n));
    }
    public static void main(String[] args) {
        VarArg1 v = new VarArg1();
        v.m1();
        v.m1(10);
        v.m1(10, 20);
        v.m1(10, 20, 30);
        v.m1(10, 20, 30, 40);
    }
}
