public class InterfacePrac4 implements It1 {

    public double m1(int a, String str) {
        System.out.println("m1 2-arguements method");
        return 22.2;
    }

    public int m1(char ch) {
        System.out.println("m1 1-arguements method");
        return 40;
    }
    public static void main(String[] args) {
        InterfacePrac4 t = new InterfacePrac4();
        int i = t.m1('p');
        System.out.println("Value = " + i);
        double d = t.m1(22, "Raj");
        System.out.println("Value = " + d);
    }
}

interface It1 {
    double m1(int a, String str);
    int m1(char ch);
}
