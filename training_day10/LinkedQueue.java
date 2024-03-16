import java.util.Scanner;

public class LinkedQueue {
    public static Scanner sc = new Scanner(System.in);
    public LinkedList front = new LinkedList();
    public LinkedList rear = new LinkedList();

    LinkedQueue() {
        front = null;
        rear = null;
    }

    public void enqueue() {
        System.out.print("Enter the data to enter: ");
        int data = sc.nextInt();

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

    public void dequeue() {
        if (front == null) {
            System.out.println("The linked list is empty");
            return ;
        }

        front = front.next;
    }

    public void peekFirst() {
        if (rear == null) {
            System.out.println("The linked list is empty");
            return ;
        }

        System.out.println("The data at the top is: " + front.data);
    }

    public void peekLast() {
        if (rear == null) {
            System.out.println("The linked list is empty");
            return ;
        }

        System.out.println("The data at the top is: " + rear.data);
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
        LinkedQueue L = new LinkedQueue();

        int choice = 0;
        do {
            System.out.println("1. Enqueue an element");
            System.out.println("2. Dequeue an element");
            System.out.println("3. Peek first element");
            System.out.println("4. Peek last element");
            System.out.println("5. Traverse the queue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    L.enqueue();
                    break;

                case 2:
                    L.dequeue();
                    break;

                case 3:
                    L.peekFirst();
                    break;

                case 4:
                    L.peekLast();
                    break;

                case 5:
                    L.traverse();
                    break;
                
                default:
                    break;
            }
        }while(choice <= 4 && choice >= 1);
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
