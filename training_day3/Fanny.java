import java.util.Scanner;
public class Fanny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter the character you want to remove from the string: ");
        char x = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                continue;
            }
            result += s.charAt(i);
        }

        System.out.println("The string after removin the character '" + x + "' is: " + result);

        sc.close();
    }
}
