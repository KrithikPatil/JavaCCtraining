import java.util.Scanner;
import java.util.Arrays;

public class TopperSearch {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int loc = i;
            for (int j = i; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    loc = j;
                }
            }

            int temp = arr[loc];
            arr[loc] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static int search(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int mid = (int) ((left + right) / 2);

        while (left <= right) {
            mid = (int) ((left + right) / 2);

            if (key < arr[mid]) {
                right = mid - 1;
            }
            else if (key > arr[mid]) {
                left = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at position " + (i + 1) +": ");
            arr[i] = sc.nextInt();
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + "\t");
        // }
        // System.out.println();

        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
        int topper_marks = arr[n - 1];

        System.out.println("Topper marks are: " + topper_marks);

        int[] result = {70, 60, 90, 88, 155, 96, 76, 72, 81};

        result = sort(result);
        System.out.println(Arrays.toString(result));
        int res = search(result, topper_marks);

        if (res == -1) {
            System.out.println("Topper not found");
        }
        else {
            System.out.println("Topper found at: " + (res + 1));
        }

        sc.close();
    }
}
