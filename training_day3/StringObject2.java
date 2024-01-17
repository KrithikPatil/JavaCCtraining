public class StringObject2 {
    public static void main(String[] args) {
        StringObject2 t1 = new StringObject2();
        StringObject2 t2 = new StringObject2();

        System.out.println(t1 == t2);
        String str1 = "Ashish";
        String str2 = "Ashish";

        System.out.println(str1 == str2);
        String s1 = new String("help4code");
        String s2 = new String("help4code");

        System.out.println(s1 == s2);
    }
}
