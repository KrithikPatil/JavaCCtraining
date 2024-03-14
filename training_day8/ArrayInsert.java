import java.util.Scanner;
import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at position " + (i + 1) +": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        System.out.print("Enter the position at which element is to be inserted: ");
        int pos = sc.nextInt();

        pos -= 1;

        System.out.println("Enter the element to be inserted at " + pos + ": ");
        int element = sc.nextInt();

        for (int i = n - 1; i >= pos; i--) {
            if (i == pos) {
                arr[i + 1] = arr[i];
                arr[i] = element;
            }
            else {
                arr[i + 1] = arr[i];
            }
        }

        n += 1;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }    
}