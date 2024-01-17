public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int N = 10;
        int result = 0;
        int present = 0;

        for (int i = 1; i <= N; i++) {
            present = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    present = 1;
                    continue;
                }
            }
            if (present == 0) {
                result = i;
                break;
            }
        }
        System.out.println("The missing number is: " + result);
    }
}
