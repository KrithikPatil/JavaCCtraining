import java.util.Scanner;
public class UpperLowerDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        if (c >= 65 && c < 91) {
            System.out.println("Uppercase character");
        }
        else if (c >= 97 && c < 122) {
            System.out.println("Lowercase character");
        }
        else if (c >= 48 && c < 58) {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special symbol");
        }
        sc.close();
    }
}
