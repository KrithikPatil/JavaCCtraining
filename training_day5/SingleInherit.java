public class SingleInherit {
    public static void main(String[] args) {
        B obj = new B();

        obj.showA();
        obj.showB();
    }
}

class A {
    public void showA() {
        System.out.println("Hey there I am in class A");
    }
}

class B extends A {
    public void showB() {
        System.out.println("Hey there I am in class B");
    }
}