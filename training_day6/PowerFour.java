import java.util.Scanner;
public class PowerFour {

    public static boolean powerFour(int num) {
        if (num == 1) {
            return true;
        }

        while (num != 0) {
            if (num == 1) {
                return true;
            }
            if (num % 4 == 0) {
                num /= 4;
                continue;
            }
            else {
                break;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        System.out.println("The number " + num + " is: " + powerFour(num));

        sc.close();
    }
}
