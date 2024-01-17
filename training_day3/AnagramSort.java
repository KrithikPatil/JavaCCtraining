import java.util.Scanner;
import java.util.Arrays;
public class AnagramSort {

    public static char[] sort(char[] ch) {
        int n = ch.length;

        for (int k = 0; k < n - 1; k++) {
            for (int j = 0; j < n - k - 1; j++) {
                if (ch[j] > ch[j + 1]) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
                else {
                    continue;
                }
            }
        }
        return ch;
    }

    public static boolean anagramChecker(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        ch1 = sort(ch1);
        ch2 = sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch2[i]) {
                continue;
            }
            else {
                return false;
            }
        }

        /*
        int present = 0;

        for (int i = 0; i < s1.length(); i++) {
            present = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    present = 1;
                    break;
                }
            }
            if (present == 1) {
                continue;
            }
            else {
                return false;
            }
        }
        */
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two string 1: ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter the string 2: ");
        String s2 = sc.nextLine();

        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();

        boolean b = anagramChecker(str1, str2);

        System.out.println("Are the two strings anagrams: " + b);

        sc.close();
    }
}
