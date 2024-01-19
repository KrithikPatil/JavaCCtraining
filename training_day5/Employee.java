import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);

    static int eno;
    static String ename;
    static double esal;
    static String city;

    public void work() {
        System.out.println("The employee is working on website development");
    }

    public void getSalary() {
        System.out.println("The salary of the employee is: " + esal);
    }

    public void addEmployee() {
        System.out.print("Enter employee no.: ");
        eno = sc.nextInt();

        System.out.print("Enter the na,e of the employee: ");
        ename = sc.next();

        System.out.print("Enter the city of the employee: ");
        city = sc.next();
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.work();
        e.addEmployee();
        e.getSalary();

        HRManager h = new HRManager();
        h.work();
        h.showEmployee();
    }
}

class HRManager extends Employee {

    Scanner sc = new Scanner(System.in);

    public HRManager() {
        System.out.println("Enter the employee salary: ");
        super.esal = sc.nextDouble();
    }

    public void work() {
        System.out.println("The employee is now working on Blockchain development");
    }

    public void showEmployee() {
        System.out.println("The employee no. is: " + super.eno);
        System.out.println("The employee no. is: " + super.ename);
        System.out.println("The employee no. is: " + super.esal);
        System.out.println("The employee no. is: " + super.city);
    }
}
