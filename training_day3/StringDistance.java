import java.util.Scanner;
public class StringDistance {

    public static int operations(String s1, String s2) {
        if (s1.equals(s2)) {
            return 0;
        }
        int ops = 0;
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        
        if (ch1.length > ch2.length) {
            ops = ch1.length - ch2.length;
        }
        else if (ch1.length == ch2.length) {
            for (int i = 0; i < ch1.length; i++){
                if (ch1[i] == ch2[i]) {
                    continue;
                }
                else {
                    ops += 1;
                }
            }
        }
        else {
            ops = ch2.length - ch1.length;
        }

        return ops;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the string 2: ");
        String s2 = sc.nextLine();

        int ops = operations(s1, s2);

        System.out.println(ops);

        sc.close();
    }
}
