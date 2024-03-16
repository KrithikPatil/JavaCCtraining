import java.util.Scanner;
import java.util.Arrays;

public class TowerOfHanoi {

    public int CAPACITY = 3;
    public int[] stackA = new int[CAPACITY];
    public int[] stackB = new int[CAPACITY];
    public int[] stackC = new int[CAPACITY];

    public TowerOfHanoi() {
        Arrays.fill(stackA, 0);
        Arrays.fill(stackB, 0);
        Arrays.fill(stackC, 0);
    }

    public boolean full(int top) {
        if (top == CAPACITY - 1) {
            return true;
        }
        return false;
    }

    public boolean empty(int top) {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public int push(int[] stack, int top, int element) {
        if (full(top)) {
            System.out.println("The stack is full");
            return top;
        }

        top += 1;
        stack[top] = element;

        // System.out.println("The element to be pushed is: " + element);
        return top;
    }

    public int pop(int[] stack, int top) {
        if (empty(top)) {
            System.out.println("The stack is empty");
            return -1;
        }

        int element = stack[top];
        stack[top] = 0;
        top -= 1;

        return top;
    }

    public void peek(int[] stack, int top) {
        if (empty(top)) {
            System.out.println("The stack is empty");
            return ;
        }

        int element = stack[top];

        System.out.println("The element at top is: " + element);
    }

    public void traverse() {
        // if (empty(top)) {
        //     System.out.println("The stack is empty");
        //     return ;
        // }

        for (int i = CAPACITY - 1; i >= 0; i--) {
            System.out.println(stackA[i] + "\t" + stackB[i] + "\t" + stackC[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TowerOfHanoi toh = new TowerOfHanoi();
        int topA = -1;
        int topB = -1;
        int topC = -1;

        topA = toh.push(toh.stackA, topA, 3);
        topA = toh.push(toh.stackA, topA, 2);
        topA = toh.push(toh.stackA, topA, 1);

        System.out.println("Pass 1: ");
        toh.traverse();

        topA = toh.pop(toh.stackA, topA);
        topC = toh.push(toh.stackC, topC, 1);
        topA = toh.pop(toh.stackA, topA);
        topB = toh.push(toh.stackB, topB, 2);

        System.out.println("Pass 2: ");
        toh.traverse();

        topC = toh.pop(toh.stackC, topC);
        topB = toh.push(toh.stackB, topB, 1);

        System.out.println("Pass 3: ");
        toh.traverse();

        topA = toh.pop(toh.stackA, topA);
        topC = toh.push(toh.stackC, topC, 3);

        System.out.println("Pass 4: ");
        toh.traverse();

        topB = toh.pop(toh.stackB, topB);
        topA = toh.push(toh.stackA, topA, 1);

        System.out.println("Pass 5: ");
        toh.traverse();

        topB = toh.pop(toh.stackB, topB);
        topC = toh.push(toh.stackC, topC, 2);
        topA = toh.pop(toh.stackA, topA);
        topC = toh.push(toh.stackC, topC, 1);

        System.out.println("Pass 6: ");
        toh.traverse();

        sc.close();
    }
}
