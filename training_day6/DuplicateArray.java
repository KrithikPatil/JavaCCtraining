import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int nums1[] = {4, 9, 5};
        int nums2[] = {9, 4, 9, 8, 4};
        int k = 0;
        int arr1[] = new int[2];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    arr1[k] = nums1[i];
                    k += 1;
                    break;
                }
            }
        }

        System.out.println("The duplicates are " + Arrays.toString(arr1));
    }
}
