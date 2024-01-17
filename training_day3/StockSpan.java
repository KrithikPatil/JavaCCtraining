import java.util.Scanner;
public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n + " elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[i] = 1;
            }
            else {
                if (arr[i] > arr[i - 1]) {
                    result[i] = (int) Math.pow(2, 3);
                }
                else if (arr[i] == arr[i - 1]) {
                    result[i] = 2;
                }
                else {
                    result[i] = 1;
                }
            }
        }

        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + "\t");
        }
        System.out.println();

        sc.close();
    }
}
