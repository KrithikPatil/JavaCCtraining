public class ConstructCall {
    public static void main(String[] args) {
        K obj = new K();

        obj.showK();
    }
}

class J {
    public J() {
        System.out.println("Constructor of J");
    }
}

class K extends J {
    public K() {
        System.out.println("Constructor of K");
    }

    public void showK() {
        System.out.println("Inside K function");
    }
}
