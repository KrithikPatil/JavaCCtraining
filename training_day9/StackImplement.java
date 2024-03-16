import java.util.Scanner;

public class StackImplement {

    public int CAPACITY = 10;
    public int[] stack = new int[CAPACITY];
    public int top = -1;

    public boolean full() {
        if (top == CAPACITY - 1) {
            return true;
        }
        return false;
    }

    public boolean empty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public void push() {
        Scanner sc = new Scanner(System.in);

        if (full()) {
            System.out.println("The stack is full");
            return ;
        }

        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt();
        top += 1;
        stack[top] = element;

        System.out.println("The element to be pushed is: " + element);
    }

    public void pop() {
        if (empty()) {
            System.out.println("The stack is empty");
            return ;
        }

        int element = stack[top];
        top -= 1;

        System.out.println("The element to be popped is: " + element);
    }

    public void peek() {
        if (empty()) {
            System.out.println("The stack is empty");
            return ;
        }

        int element = stack[top];

        System.out.println("The element at top is: " + element);
    }

    public void traverse() {
        if (empty()) {
            System.out.println("The stack is empty");
            return ;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImplement si = new StackImplement();

        int choice = 0;
        do {
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Peek an element");
            System.out.println("4. Check if stack is full");
            System.out.println("5. Traverse the stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    si.push();
                    break;

                case 2:
                    si.pop();
                    break;

                case 3:
                    si.peek();
                    break;

                case 4:
                    boolean flag = si.full();
                    if (flag) {
                        System.out.println("The stack is full");
                    }
                    else {
                        System.out.println("The stack is not full");
                    }
                    break;

                case 5:
                    si.traverse();
                    break;
                
                default:
                    break;
            }
        }while(choice <= 5 && choice >= 1);

        sc.close();
    }
}
