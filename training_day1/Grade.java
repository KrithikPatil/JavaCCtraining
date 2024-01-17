import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in four subs: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        double result = (double) (m1 + m2 + m3 + m4);
        double per = (result / 400) * 100;
        System.out.println("Percentage marks is: " + per);

        if(per >= 90) {
            System.out.println("Grade: A");
        }
        else if(per >= 80 && per < 90) {
            System.out.println("Grade: B");
        }
        else if(per >= 70 && per < 80) {
            System.out.println("Grade: C");
        }
        else if(per >= 60 && per < 70) {
            System.out.println("Grade: D");
        }
        else if(per >= 40 && per < 60) {
            System.out.println("Grade: E");
        }
        else {
            System.out.println("Grade: F");
        }
        sc.close();
    }
}
