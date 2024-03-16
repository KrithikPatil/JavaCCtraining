import java.util.Scanner;

public class RotateLinkedList {
    public static Scanner sc = new Scanner(System.in);
    public LinkedList front = new LinkedList();
    public LinkedList rear = new LinkedList();

    RotateLinkedList() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        LinkedList newNode = new LinkedList(data);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("The linked list is empty");
            return -1;
        }
        
        int element = front.data;
        front = front.next;
        
        return element;
    }

    public void traverse() {
        LinkedList ptr = front;
        while (ptr != null) {
            System.out.print(ptr.data + "-->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateLinkedList r = new RotateLinkedList();

        System.out.print("Enter an element in the stack/type -1 to stop: ");
        int num = sc.nextInt();

        while (num != -1) {
            r.enqueue(num);
            System.out.print("Enter an element in the stack/type -1 to stop: ");
            num = sc.nextInt();
        }

        System.out.print("Enter the value by which to rotate: ");
        int k = sc.nextInt();

        int i = 0;
        while (i != k) {
            int element = r.dequeue();
            r.enqueue(element);
            i += 1;
        }

        r.traverse();
    }
}

class LinkedList {
    public int data;
    LinkedList next;

    LinkedList() {
        next = null;
    }

    LinkedList(int data) {
        this.data = data;
        this.next = null;
    }
}
