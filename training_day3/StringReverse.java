import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String s = sc.nextLine();
        String reverse = "";

        for (int i = s.length() - 1; i >= 0 ; i--) {
            reverse += s.charAt(i);
        }

        System.out.println("The reverse of the string " + s + " is: " + reverse);

        sc.close();
    }
}
