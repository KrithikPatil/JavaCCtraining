import java.util.Scanner;
public abstract class BankAccount {

    static int c_accno;
    static String c_name;
    static String c_city;
    static double s_balance;
    static double c_balance;

    public BankAccount() {
        s_balance = 5000;
        c_balance = 5000;
    }

    public static void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account no.: ");
        c_accno = sc.nextInt();

        System.out.print("Enter the name of customer: ");
        c_name = sc.next();

        System.out.print("Enter the city: ");
        c_city = sc.next();
    }

    abstract void deposit();

    // public void deposit() {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter the balance to be deposited: ");
    //     double add = sc.nextDouble();

    //     balance += add;
    // }

    abstract void withdraw(double amount);

    // public void withdraw(double amount) {
    //     balance -= amount;
    //     System.out.println("The remaining balance is: " + balance);
    // }

    public static void display() {
        System.out.println("Account no.\tName\tCity\tSavings Balance\tCurrent Balance");
        System.out.println(c_accno + "\t" + c_name + "\t" + c_city + "\t" + s_balance + "\t" +  c_balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BankAccount b = new BankAccount();
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();
        Interest1 i1 = new Interest1();
        Interest2 i2 = new Interest2();

        while (true) {
            System.out.println("Main menu\n");
            System.out.println("1. Input data");
            System.out.println("2. Display data");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Interest money");
            System.out.println("6. Exit\n");

            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    inputData();
                    break;
                
                case 2:
                    display();
                    break;

                case 3:
                    System.out.println("Which account do you want to use: ");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account\n");
                    
                    System.out.print("Enter the choice: ");
                    int choice = sc.nextInt();

                    if (choice == 1) {
                        s.deposit();
                    }
                    else {
                        c.deposit();
                    }
                    break;

                case 4:
                    System.out.print("Enter the amount to be withdrawn: ");
                    double amount = sc.nextDouble();

                    System.out.println("Which account do you want to use: ");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account\n");
                    
                    System.out.print("Enter the choice: ");
                    ch = sc.nextInt();

                    if (ch == 1) {
                        s.withdraw(amount);
                    }
                    else {
                        c.withdraw(amount);
                    }
                    break;

                case 5:
                    System.out.println("Which account do you want to use: ");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account\n");
                    
                    System.out.print("Enter the choice: ");
                    ch = sc.nextInt();

                    if (ch == 1) {
                        i1.calcInterest();
                    }
                    else {
                        i2.calcInterest();
                    }
                    break;
                
                default:
                    System.exit(0);
            }
        }
    }
}

interface RBI {
    double s_interest_rate = 4;
    double c_interest_rate = 2;
    void calcInterest();
}

class SavingsAccount extends BankAccount {
    public void withdraw(double amount) {
        if (amount <= 5000 && (super.s_balance - amount) >= 1000) {
            s_balance -= amount;
            System.out.println("The remaining balance is: " + s_balance);
        }
        else {
            System.out.println("The balance is " + super.s_balance + " hence can't withdraw");
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance to be deposited: ");
        double add = sc.nextDouble();

        s_balance += add;
    }
}

class CurrentAccount extends SavingsAccount {
    public void withdraw(double amount) {
        if (amount <= 5000 && (super.c_balance - amount) >= 1000) {
            c_balance -= amount;
            System.out.println("The remaining balance is: " + c_balance);
        }
        else {
            System.out.println("The balance is " + super.c_balance + " hence can't withdraw");
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance to be deposited: ");
        double add = sc.nextDouble();

        c_balance += add;
    }
}

class Interest1 extends SavingsAccount implements RBI {

    static double interest = 3;

    public void calcInterest() {
        if (s_interest_rate >= interest) {
            System.out.println("The interest rate of the bank is higher");
            return ;
        }
        double interest = (0.04 * s_balance);
        System.out.println("The interest on savings account is: " + interest);
    }
}

class Interest2 extends CurrentAccount implements RBI {

    static double interest = 3;

    public void calcInterest() {
        if (s_interest_rate >= interest) {
            System.out.println("The interest rate of the bank is higher");
            return ;
        }
        double interest = (0.02 * c_balance);
        System.out.println("The interest on savings account is: " + interest);
    }
}
