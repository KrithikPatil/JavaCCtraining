import java.util.Scanner;

public class ReverseArray {

    public int[] stack = new int[100];
    public int top = -1;

    public void push(int element) {
        // if (full()) {
        //     System.out.println("The stack is full");
        //     return ;
        // }
        top += 1;
        stack[top] = element;
    }

    public int pop() {
        // if (empty()) {
        //     System.out.println("The stack is empty");
        //     return ;
        // }

        int element = stack[top];
        top -= 1;

        return element;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseArray r = new ReverseArray();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at position " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            r.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            arr[i] = r.pop();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        sc.close();
    }
}
