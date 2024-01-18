import java.util.Scanner;
public class ConstructorPrac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        Area a = new Area(length, breadth);

        System.out.println("The area of the rectangle is: " + a.returnArea());

        sc.close();
    }
}

class Area {

    int length, breadth;

    public Area(int x, int y) {
        length = x;
        breadth = y;
    }

    public int returnArea() {
        return length * breadth;
    }
}
