public class ConstructorPrac1 {
    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.Area();
        t.perimeter();
    }
}


class Triangle {

    int a, b, c;

    Triangle() {
        a = 4;
        b = 5;
        c = 6;
    }

    public void Area() {
        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of the triangle is: " + area);
    }

    public void perimeter() {
        int perimeter = a + b + c;

        System.out.println("The perimeter of the triangle is: " + perimeter);
    }
}