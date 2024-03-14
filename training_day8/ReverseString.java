import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.next();

        String res = "";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            }
            else {
                res = temp + " " + res;
                System.out.println("Hi");
                temp = "";
            }
        }

        System.out.println(res);

        sc.close();
    }
}
