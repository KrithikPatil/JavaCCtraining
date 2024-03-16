import java.util.Scanner;
import java.util.Arrays;

public class QueueImplement {
    public int CAPACITY = 10;
    public int[] queue = new int[CAPACITY];
    public int front = 0;
    public int rear = -1;
    public static Scanner sc = new Scanner(System.in);

    public QueueImplement() {
        Arrays.fill(queue, -1);
    }

    public boolean full() {
        if (rear == CAPACITY - 1) {
            return true;
        }
        return false;
    }

    public boolean empty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }

    public void enqueue() {
        if (full()) {
            System.out.println("The queue is full");
            return ;
        }

        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt();
        rear += 1;
        queue[rear] = element;

        System.out.println("The element to be pushed is: " + element);
    }

    public void dequeue() {
        if (empty()) {
            System.out.println("The queue is empty");
            return ;
        }

        int j = front;
        int element = queue[front];
        while (j < rear) {
            queue[j] = queue[j + 1];
            j += 1;
        }
        queue[rear] = -1;
        rear -= 1;

        System.out.println("The element to be popped is: " + element);
    }

    public void peek() {
        if (empty()) {
            System.out.println("The queue is empty");
            return ;
        }

        int element = queue[rear];

        System.out.println("The element at top is: " + element);
    }

    public void traverse() {
        if (empty()) {
            System.out.println("The queue is empty");
            return ;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplement qi = new QueueImplement();

        int choice = 0;
        do {
            System.out.println("1. Enqueue an element");
            System.out.println("2. Dequeue an element");
            System.out.println("3. Peek an element");
            System.out.println("4. Check if queue is full");
            System.out.println("5. Traverse the queue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    qi.enqueue();
                    break;

                case 2:
                    qi.dequeue();
                    break;

                case 3:
                    qi.peek();
                    break;

                case 4:
                    boolean flag = qi.full();
                    if (flag) {
                        System.out.println("The queue is full");
                    }
                    else {
                        System.out.println("The queue is not full");
                    }
                    break;

                case 5:
                    qi.traverse();
                    break;
                
                default:
                    break;
            }
        }while(choice <= 5 && choice >= 1);

        sc.close();
    }
}
