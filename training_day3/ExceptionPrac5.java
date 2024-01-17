import java.util.*;

public class ExceptionPrac5 {

    static void status(int age) throws InvalidAgeException {
        if (age > 18) {
            System.out.println("Elegible to marry");
        }
        else {
            throw new InvalidAgeException("Not eleigible to marry");
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
    public InvalidAgeException(String str) {
        System.out.println(str);
    }
}