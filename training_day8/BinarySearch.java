import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
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
        Arrays.sort(arr);

        System.out.print("Enter thekey to be searched: ");
        int key = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int mid = (int) ((left + right) / 2);

        while (left <= right) {
            mid = (int) ((left + right) / 2);
            if (key > arr[mid]) {
                left = mid + 1;
            }
            else if (key < arr[mid]) {
                right = mid - 1;
            }
            else {
                break;
            }
        }

        if (arr[mid] == key) {
            System.out.println("Element found at: " + mid);
        }
        else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
