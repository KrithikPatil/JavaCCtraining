import java.util.Scanner;
public class VowelEncrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        char consonants[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        System.out.print("Enter the number to be encrypted: ");
        String num = sc.nextLine();

        sc.close();
    }
}
