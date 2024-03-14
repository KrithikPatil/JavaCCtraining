import java.util.Scanner;

class ArrayDelete {
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

        System.out.print("Enter the position of element to be deleted: ");
        int pos = sc.nextInt();

        int j = pos - 1;
        while (j < n - 1) {
            arr[j] = arr[j + 1];
            j += 1;
        }
        n -= 1;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        sc.close();
    }
}