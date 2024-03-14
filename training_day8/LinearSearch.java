import java.util.Scanner;

public class LinearSearch {
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

        System.out.print("Enter key to be searched: ");
        int key = sc.nextInt();

        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        if (i == n) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at: " + (i + 1));
        }

        sc.close();
    }
}
