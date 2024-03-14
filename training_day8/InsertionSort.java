import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at position " + (i + 1) +": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int loc = i - 1;

            while (loc >= 0 && arr[loc] > temp) {
                arr[loc + 1] = arr[loc];
                loc--;
            }
            arr[loc + 1] = temp;

            System.out.println(Arrays.toString(arr));
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        sc.close();
    }
}
