public class ConstructorPrac2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        int area1 = r1.area();
        int area2 = r2.area();

        System.out.println("The area of the 1st rectangle is: " + area1);
        System.out.println("The area of the 2nd rectangle is: " + area2);
    }
}

class Rectangle {

    int length, breadth;
    
    public Rectangle (int x, int y) {
        length = x;
        breadth = y;
    }

    public int area() {
        int area = length * breadth;

        return area;
    }
}
