import java.util.Arrays;
public class VarArg2 {

    public void m1(char ch, int... n) {
        System.out.println(ch);
        System.out.println(Arrays.toString(n));
    }
    public static void main(String[] args) {
        VarArg2 v = new VarArg2();

        v.m1('A');
        v.m1('A', 10);
        v.m1('A', 10, 20);
        v.m1('A', 10, 20, 30);
    }
}
