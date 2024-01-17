import java.util.*;
public class ExceptionPrac3 {

    static void checkAge(int age) {
        if (age > 18) {
            System.out.println("Elegible for marriage");
        }
        else {
            throw new ArithmeticException("Not elegible to marry");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        checkAge(age);

        sc.close();
    }
}
