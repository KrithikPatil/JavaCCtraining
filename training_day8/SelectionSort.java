import java.util.Scanner;

public class SelectionSort {
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

        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int loc = i;
            for (int j = i; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    loc = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[loc];
            arr[loc] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        sc.close();
    }
}
