import java.util.*;

public class ShoppingCart {
    public static ArrayList<Integer> itemNo;
    public static ArrayList<String> itemName;
    public static ArrayList<Integer> itemPrice;

    public ShoppingCart() {
        itemNo = new ArrayList<>();
        itemName = new ArrayList<>();
        itemPrice = new ArrayList<>();
    }

    public static void addItems() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item no: ");
        itemNo.add(sc.nextInt());

        System.out.print("Enter the item name: ");
        itemName.add(sc.next());

        System.out.print("Enter the item price: ");
        itemPrice.add(sc.nextInt());
    }

    public static void showItems() {
        System.out.println("Item no. \t Item name \t Item price");
        for (int i = 0; i < itemNo.size(); i++) {
            System.out.println(itemNo.get(i).toString() + "\t" + itemName.get(i).toString() + "\t" + itemPrice.get(i).toString());
        }
    }

    public static void deleteItems() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item number to be deleted: ");
        int num = sc.nextInt();

        for (int i = 0; i < itemNo.size(); i++) {
            if (itemNo.get(i) == num) {
                itemNo.remove(i);
                itemName.remove(i);
                itemPrice.remove(i);
            }
        }
    }

    public static void updateItems() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item number to be updated: ");
        int num = sc.nextInt();
        
        for (int i = 0; i < itemNo.size(); i++) {
            if (itemNo.get(i) == num) {
                System.out.print("Enter the name of the item: ");
                itemName.add(i, sc.next());

                System.out.print("Enter the price of the item: ");
                itemPrice.add(i, sc.nextInt());
            }
        }
    }

    public static void orderMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item number to be ordered: ");
        int num = sc.nextInt();

        for (int i = 0; i < itemNo.size(); i++) {
            if (itemNo.get(i) == num) {
                System.out.println("Order for " + itemName.get(i).toString() + ", " + itemPrice.get(i).toString() + " successfully placed");
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1. Add items");
            System.out.println("2. Show items");
            System.out.println("3. Delete items");
            System.out.println("4. Update items");
            System.out.println("5. Order Menu");
            System.out.println("6. Exit ");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addItems();
                    break;

                case 2:
                    showItems();
                    break;

                case 3:
                    deleteItems();
                    break;
                
                case 4:
                    updateItems();
                    break;

                case 5:
                    orderMenu();
                    break;
                
                default:
                    break;
            }

        } while (choice >= 1 && choice <= 5);
    }
}
