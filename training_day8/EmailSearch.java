import java.util.Scanner;

public class EmailSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the email at position " + (i + 1) +": ");
            arr[i] = sc.next();
        }

        // for (int i = 0; i < 5; i++) {
        //     System.out.print(arr[i] + "\t");
        // }
        // System.out.println();

        for (int i = 0; i < 5; i++) {
            if (arr[i].startsWith("raj")) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
