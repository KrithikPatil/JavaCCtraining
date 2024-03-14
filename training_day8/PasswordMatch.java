import java.util.Scanner;

public class PasswordMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] user = {"Krithik", "Savinay", "Ayush", "Advait", "Unnati", "Shreyas", "Aayush", "Disha", "Ajay", "Aditya"};
        String[] passwd = {"hey", "ohk", "kya", "kyu", "hai", "go", "went", "to", "rof", "kjl"};

        System.out.print("Enter the username: ");
        String name = sc.next();

        System.out.print("Enter the password: ");
        String password = sc.next();

        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            if (user[i].equals(name) && passwd[i].equals(password)) {
                flag = true;
                System.out.println("Login successful");
                break;
            }
        }

        if (!flag) {
            System.out.println("User not found");
        }

        sc.close();
    }
}
