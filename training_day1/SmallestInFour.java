import java.util.Scanner;

public class SmallestInFour {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any four numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int min = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }
        System.out.println("The minimum numer is: " + min);
        sc.close();
    }
}
