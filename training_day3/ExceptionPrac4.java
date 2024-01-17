import java.util.*;

public class ExceptionPrac4 {

    static void status(int age) throws InvalidAgeException {
        if (age > 18) {
            System.out.println("Elegible to marry");
        }
        else {
            throw new InvalidAgeException();
        }
    }
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        status(age);

        sc.close();
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        System.out.println("Not eleigible to marry");
    }
}