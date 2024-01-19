public class RatProb {

    public static int ratSol(int r, int unit, int[] arr) {

        int sum = 0;

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if ((r * unit) <= sum) {
                return (i + 1);
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int arr[] = {2, 8, 3, 5, 7, 4, 1, 2};

        int houses = ratSol(r, unit, arr);

        System.out.println("The rats requires "+ houses + " houses");
    }
}
