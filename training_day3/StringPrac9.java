public class StringPrac9 {
    public static void main(String[] args) {
        String s1 = "Ashish";
        boolean b = s1.equalsIgnoreCase("ashish");
        System.out.println(b);
        System.out.println(s1.equalsIgnoreCase("Ashish"));
        String s2 = "Prashant";
        boolean b1 = s1.equalsIgnoreCase(s2);
        System.out.println(b1);
    }
}
