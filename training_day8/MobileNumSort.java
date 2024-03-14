import java.util.Scanner;

public class MobileNumSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] mob = new long[10];

        System.out.print("Enter 10 mobile numbers: ");
        
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            mob[i] = sc.nextLong();
            String s = String.valueOf(mob[i]);
            if (s.length() != 10) {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Please enter a 10 digit number");
            System.exit(1);
        }

        for (int i = 1; i < 10; i++) {
            int loc = i - 1;
            long temp = mob[i];

            while (loc >= 0 && mob[loc] > temp) {
                mob[loc + 1] = mob[loc];
                loc--;
            }

            mob[loc + 1] = temp;
        }

        for (int i = 0; i < 10; i++) {
            if (i >= 4 && i <= 7) {
                System.out.print(mob[i] + "Hello" + "\t");
            }
            else {
                System.out.print(mob[i] + "Hi" + "\t");
            }
        }

        sc.close();
    }
}
