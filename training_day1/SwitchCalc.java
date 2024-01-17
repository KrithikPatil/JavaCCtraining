import java.util.Scanner;
public class SwitchCalc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit\n");
        
        System.out.print("Enter you choice: ");
        int choice = sc.nextInt();
        int result = 0;

        switch (choice){
            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 * num2;
                break;

            case 4:
                result = num1 / num2;
                break;

            case 5:
                System.exit(0);
                break;

            default:
                System.out.println("Wrong choice");
                break;
        }

        System.out.println("\nThe result of the operation is: " + result);
        sc.close();
    }
}