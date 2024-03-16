import java.util.Scanner;

public class LinkedListPrac1 {
    public static Scanner sc = new Scanner(System.in);
    public LinkedList head = new LinkedList();

    LinkedListPrac1() {
        head = null;
    }

    public void addEnd() {
        System.out.print("Enter the data to enter: ");
        int data = sc.nextInt();

        LinkedList newNode = new LinkedList(data);

        if (head == null) {
            head = newNode;
        }
        else {
            LinkedList ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    public void addBegin() {
        System.out.print("Enter the data to enter: ");
        int data = sc.nextInt();

        LinkedList newNode = new LinkedList(data);
        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAfter() {
        System.out.print("Enter the data to enter: ");
        int data = sc.nextInt();

        System.out.print("Enter the data after which to enter: ");
        int after = sc.nextInt();

        LinkedList newNode = new LinkedList(data);

        LinkedList ptr = head;
        LinkedList next_ptr = head;

        if (head == null) {
            head = newNode;
        }
        else {
            while (ptr.data != after) {
                ptr = next_ptr;
                next_ptr = next_ptr.next;
            }
            newNode.next = next_ptr;
            ptr.next = newNode;
        }
    }

    public void delEnd() {
        if (head == null) {
            System.out.println("The linked list is empty");
            return ;
        }

        LinkedList ptr = head;
        LinkedList prev_ptr = head;
        while (ptr.next != null) {
            prev_ptr = ptr;
            ptr = ptr.next;
        }
        prev_ptr.next = null;
        ptr = null;
    }

    public void delBegin() {
        if (head == null) {
            System.out.println("The linked list is empty");
            return ;
        }

        LinkedList ptr = head;
        head = head.next;
        ptr = null;
    }

    public void delAfter() {
        if (head == null) {
            System.out.println("The linked list is empty");
            return ;
        }

        System.out.print("Enter the element after which node is to be deleted: ");
        int after = sc.nextInt();

        LinkedList ptr = head;
        LinkedList del_ptr = head;

        while (ptr.data != after) {
            ptr = del_ptr;
            del_ptr = del_ptr.next;
        }

        ptr.next = del_ptr.next;
        del_ptr = null;
    }

    public void delAny() {
        System.out.print("Enter the element to be deleted: ");
        int e = sc.nextInt();

        if (head == null) {
            System.out.println("The linked list is empty");
            return ;
        }

        LinkedList ptr = head;
        LinkedList del_ptr = head;
        while(del_ptr.data != e) {
            ptr = del_ptr;
            del_ptr = del_ptr.next;
        }

        ptr.next = del_ptr.next;
        del_ptr = null;
    }

    public void traverse() {
        LinkedList ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "-->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int choice = 0;
        LinkedListPrac1 L = new LinkedListPrac1();
        do {
            System.out.println("1. Add a node at end");
            System.out.println("2. Add a node at begin");
            System.out.println("3. Add a node after");
            System.out.println("4. Delete a node at end");
            System.out.println("5. Delete a node at begin");
            System.out.println("6. Delete a node after");
            System.out.println("7. Delete a node anywhere");
            System.out.println("8. Traverse the LL");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    L.addEnd();
                    break;
                
                case 2:
                    L.addBegin();
                    break;

                case 3:
                    L.addAfter();
                    break;

                case 4:
                    L.delEnd();
                    break;

                case 5:
                    L.delBegin();
                    break;

                case 6:
                    L.delAfter();
                    break;
                
                case 7:
                    L.delAny();
                    break;

                case 8:
                    L.traverse();
                    break;

                default:
                    break;
            }
        }while (choice >= 1 && choice <= 8);
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
