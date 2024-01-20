public class MultipleInherit extends Pqr implements Abc {

    public void show() {
        System.out.println("I am in Abc");
    }
    public static void main(String[] args) {
        Abc a;
        MultipleInherit z = new MultipleInherit();
        a = z;
        a.show();
        System.out.println(i);
    }
}

interface Abc {
    public void show();
}

class Pqr {
    static int i = 20;
}
