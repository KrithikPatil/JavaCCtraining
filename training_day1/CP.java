import java.util.Scanner;
public class CP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price of the item: ");
        int cp = sc.nextInt();

        System.out.print("Enter whether student or not(Y/N): ");
        char st = sc.next().charAt(0);

        double disc = 0;

        if (st == 'Y') {
            if (cp > 500) {
                disc = 10;
            }
            else{
                disc = 5;
            }
        }
        else{
            if (cp > 500){
                disc = 8;
            }
            else{
                disc = 2;
            }
        }

        double discount = (disc / 100) * cp;
        double np = cp - discount;

        System.out.println("The cp is " + cp);
        System.out.println("The discount is " + discount);
        System.out.println("The net price is " + np);

        sc.close();
    }
}
