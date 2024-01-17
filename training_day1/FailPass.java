import java.util.Scanner;
public class FailPass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        double result = (double) (m1 + m2 + m3);
        double percent = (result / 300) * 100;

        System.out.println("Percentage marks is: " + percent);

        if (percent < 45){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
        sc.close();
    }
}
