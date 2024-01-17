import java.util.Scanner;
public class Third {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();
        int r1 = num % 10;
        num = num / 10;
        int r2 = num % 10;
        int r3 = num / 10;
        System.out.println(r1 + r2 + r3);
        sc.close();
    }
}
