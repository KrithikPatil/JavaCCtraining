public class InterfacePrac1 {
    public static void main(String[] args) {
        ABC a = new ABC();
        a.show1();
    }
}

interface I1 {
    public void show1();
    public void show2();
}

class ABC implements I1 {
    public void show1() {
        System.out.println("show 1 method");
    }

    public void show2() {
        
    }
}