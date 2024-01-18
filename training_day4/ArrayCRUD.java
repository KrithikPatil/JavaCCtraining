import java.util.Scanner;
public class ArrayCRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentData sd = new StudentData();

        while (true) {
            System.out.println("Main menu:\n");
            System.out.println("1. Input data");
            System.out.println("2. Update data");
            System.out.println("3. Delete data");
            System.out.println("4. Display data");
            System.out.println("5. Exit\n");

            System.out.print("Enter your choice: ");
            int c = sc.nextInt();

            switch (c) {
                case 1:
                    sd.inputData();
                    break;
                
                case 2:
                    sd.updateData();
                    break;
                
                case 3:
                    sd.deleteData();
                    break;
                
                case 4:
                    sd.displayData();
                    break;

                case 5:
                    System.exit(0);
                
                default:
                    System.out.println("Invalid choice enter between 1 to 5 only");
                    break;
            }
        }
    }
}

class StudentData {

    Scanner sc = new Scanner(System.in);

    int rollNo[] = new int[10];
    String name[] = new String[10];
    String city[] = new String[10];
    long mobile[] = new long[10];

    static int student = 0;

    public void inputData() {

        System.out.print("Enter the roll no. of the student: ");
        rollNo[student] = sc.nextInt();

        System.out.print("Enter the name of the student: ");
        name[student] = sc.next();

        System.out.print("Enter the city of the student: ");
        city[student] = sc.next();

        System.out.print("Enter the mobile no. of the student: ");
        mobile[student] = sc.nextLong();

        student += 1;
    }

    public void updateData() {

        System.out.print("Enter the roll no. of the student: ");
        int roll = sc.nextInt();

        for (int i = 0; i < student; i++) {
            if (roll == rollNo[i]) {
                System.out.println("1. Update name");
                System.out.println("2. Update city");
                System.out.println("3. Update mobile\n");

                System.out.println("Enter your choice to update: ");
                int c = sc.nextInt();

                switch (c) {
                    case 1:
                        System.out.print("Enter the new name of the student: ");
                        String newName = sc.next();

                        name[i] = newName;
                        System.out.println("The name is updated");
                        break;

                    case 2:
                        System.out.print("Enter the new city of the student: ");
                        String newCity = sc.next();

                        city[i] = newCity;
                        System.out.println("The city is updated");
                        break;

                    case 3:
                        System.out.print("Enter the new mobile no. of the student: ");
                        long newMobile = sc.nextLong();

                        mobile[i] = newMobile;
                        System.out.println("The mobile no is updated");
                    
                    default:
                        break;
                }
                break;
            }
        }
    }

    public void deleteData() {

        System.out.print("Enter the roll no. of the student to be deleted: ");
        int roll = sc.nextInt();

        for (int i = 0; i < student - 1; i++) {
            if (roll == rollNo[i]) {
                for (int j = i; j < student - 1; j++) {
                    rollNo[j] = rollNo[j + 1];
                    name[j] = name[j + 1];
                    city[j] = city[j + 1];
                    mobile[j] = mobile[j + 1];
                }
                break;
            }
        }

        student -= 1;
    }

    public void displayData() {
        
        System.out.println("Roll no.\tName\tCity\tMobile");
        System.out.println("-------------------------------");
        for (int i = 0; i < student; i++) {
            System.out.println(rollNo[i] + "\t" + name[i] + "\t" + city[i] + "\t" + mobile[i]);
        }
    }

}