import java.util.Scanner;
public class Weekend {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day('mon'/'tue'/'thu', etc.): ");
        String day = sc.next();
        System.out.println(day);

        if (day.equals("sun") || day.equals("sat")) {
            System.out.println("It is a weekend");
        }
        else{
            System.out.println("It is a working day");
        }
        sc.close();
    }
}
