import java.util.Scanner;
public class ClassPrac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations ops = new Operations();

        while (true) {
            System.out.println("Menu\n");

            System.out.println("1. Factorial");
            System.out.println("2. Power");
            System.out.println("3. Square root");
            System.out.println("4. Exit\n");

            System.out.print("Enter your choice: ");
            int c = sc.nextInt();

            int result = 0;

            switch (c) {
                case 1:
                    result = ops.factorial();
                    System.out.println("The result for factorial is: " + result);
                    break;
                
                case 2:
                    result = ops.power();
                    System.out.println("The result for power is: " + result);
                    break;
                
                case 3:
                    double result1 = ops.squareRoot();
                    System.out.println("The result for square root is: " + result1);
                    break;

                default:
                    System.exit(0);
            }
        }
    }
}

class Operations {
    Scanner sc = new Scanner(System.in);

    public int factorial() {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fact = 1;

        if (num == 0) {
            return 1;
        }

        for (int i = num; i >= 1; i--) {
            fact *= i;
        }

        return fact;
    }

    public int power() {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;

        if (num == 0 || power == 0) {
            return 1;
        }

        for (int i = 0; i < power; i++) {
            result *= num;
        }

        return result;
    }

    public double squareRoot() {
        System.out.print("Enter the number: ");
        double num = sc.nextInt();

        double result = 0;

        double first = 0, last = num;
        double mid = (first + last) / 2;

        while(first != last) {
            if ((mid * mid) > num) {
                last = mid;
            }
            else if (Math.floor(mid * mid) == num) {
                result = mid;
                break;
            }
            else {
                first = mid;
            }

            mid = (first + last) / 2;
        }

        return result;
    }
}