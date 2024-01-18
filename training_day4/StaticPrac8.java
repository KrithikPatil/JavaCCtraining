public class StaticPrac8 {
    public static void show() {
        System.out.println("Non static show");
    }

    {
        show();
    }

    static {
        System.out.println("I am in static block");
    }

    public static void main(String[] args) {
        StaticPrac8 s = new StaticPrac8();
        System.out.println("I am in main");
    }
}
