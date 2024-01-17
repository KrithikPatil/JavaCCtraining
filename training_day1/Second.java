import java.util.Scanner;
public class Second {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two digit number: ");
        int num = sc.nextInt();
        int q = num / 10;
        int r = num % 10;
        System.out.println(q + r);
        sc.close();
    }
}
