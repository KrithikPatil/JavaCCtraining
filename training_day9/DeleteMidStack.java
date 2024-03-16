import java.util.Scanner;

public class DeleteMidStack {

    public int[] stack;
    public int top = -1;

    public DeleteMidStack(int n) {
        stack = new int[n];
    }

    public boolean empty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public void push(int element) {
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

    public void traverse() {
        // if (empty()) {
        //     System.out.println("The stack is empty");
        //     return ;
        // }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int n = sc.nextInt();

        DeleteMidStack d = new DeleteMidStack(n);
        DeleteMidStack d1 = new DeleteMidStack(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at position " + (i + 1) + ": ");
            d.push(sc.nextInt());
        }

        int mid = (int) (d.top / 2);
        int i = d.top;

        while (i != mid - 1) {
            d1.push(d.pop());
            i -= 1;
        }

        d1.pop();

        while (!d1.empty()) {
            d.push(d1.pop());
        }

        d.traverse();

        sc.close();
    }
}
