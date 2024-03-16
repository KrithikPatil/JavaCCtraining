import java.util.Scanner;

public class ReverseStrStack {
    public char[] stack = new char[100];
    public int top = -1;

    public char pop() {
        // int element = stack[top];
        char element = stack[top];
        stack[top] = ' ';
        top -= 1;

        return element;
    }

    public void push(char element) {
        top += 1;
        stack[top] = element;

        // System.out.println("The element to be pushed is: " + element);
        // return top;
    }

    public boolean empty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseStrStack s = new ReverseStrStack();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (char c : str.toCharArray()) {
            s.push(c);
        }

        String rev = "";
        while (!s.empty()) {
            rev += s.pop();
        }

        System.out.println("The reversed string is: " + rev);

        sc.close();
    }
}
