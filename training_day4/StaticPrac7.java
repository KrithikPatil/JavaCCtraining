public class StaticPrac7 {
    {
        System.out.println("I am in non static block");
    }

    static {
        System.out.println("I am in static blck");
    }

    public static void main(String[] args) {
        StaticPrac7 s = new StaticPrac7();

        System.out.println("I am in main");
    }
}
