public class IsBad {

    static int bad = 3;

    public static boolean isBadVersion(int i) {
        if (i < bad) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.println("The " + i + "th version is bad: " + isBadVersion(i));
        }
    }
}
