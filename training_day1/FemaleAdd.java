import java.util.Scanner;
public class FemaleAdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        double result = (double) (m1 + m2 + m3);
        double percent = (result / 300) * 100;

        System.out.print("Enter the gender of the person(M/F): ");
        char gender = sc.next().charAt(0);

        if(percent >= 80 && gender == 'F') {
            System.out.println("Admission granted");
        }
        else if(percent >= 60 && gender == 'M') {
            System.out.println("Admission granted");
        }
        else{
            System.out.println("Admission not granted");
        }
        sc.close();
    }
}
