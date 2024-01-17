import java.util.Scanner;
class LargestInFive{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any five numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        if (num5 > max) {
            max = num5;
        }
        System.out.println("The maximum numer is: " + max);
        sc.close();
    }
}