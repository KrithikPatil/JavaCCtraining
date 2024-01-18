public class StaticPrac9 {
    public static void show() {
        System.out.println("Non static show");
    }

    public static void show1() {
        System.out.println("static show1");
    }

    {
        show();
    }

    static {
        show1();
    }

    public static void main(String[] args) {
        StaticPrac9 s = new StaticPrac9();
        System.out.println("I am in main");
    }
}
