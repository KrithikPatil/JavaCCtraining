import java.util.Scanner;
public class UserPasswdExcep {

    public static void authenticateUser(String username, String password) throws InvalidUserPasswd {
        if (username.equals("Krithik") && password.equals("abcd")) {
            System.out.println("Login successful");
        }
        else {
            throw new InvalidUserPasswd("Invalid username or password");
        }
    }
    public static void main(String[] args) throws InvalidUserPasswd {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the username: ");
        String username = sc.nextLine();

        System.out.print("Enter the passowrd: ");
        String password = sc.nextLine();

        authenticateUser(username, password);

        sc.close();
    }
}

class InvalidUserPasswd extends Exception {
    public InvalidUserPasswd(String str) {
        System.out.println(str);
    }
}
