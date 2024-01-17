import java.util.Scanner;
public class Sixth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int first = num / 10000;
        System.out.println(first + last);
        sc.close();
    }
}
