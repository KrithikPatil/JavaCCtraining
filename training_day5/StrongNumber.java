import java.util.Scanner;
public class StrongNumber {

    public static int fact(int num) {

        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }

        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int numCopy = num;

        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            int temp = fact(rem);
            sum += temp;
            num /= 10;
        }

        if (sum == numCopy) {
            System.out.println("The number is strong");
        }
        else {
            System.out.println("The number is not strong");
        }

        sc.close();
    }
}
