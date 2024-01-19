import java.util.Scanner;
public class ReduceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.next();
        String reduced = "";

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = curr;
            int index = i;
            int j = i + 1;
            int count = 1;
            while (j < s.length() && s.charAt(j) == prev) {
                count += 1;
                j += 1;
            }
            i = j - 1;
            
            if (count == 1) {
                reduced += s.charAt(index);
                continue;
            }
            reduced = reduced + s.charAt(index) + count;
        }

        System.out.println("The reduced string is: " + reduced);

        sc.close();
    }
}
