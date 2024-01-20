import java.util.Arrays;
public class DiffArray {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3};
        int nums2[] = {2, 4, 6};
        int k = 0;
        int arr1[] = new int[2];
        int arr2[] = new int[2];

        for (int i = 0; i < nums1.length; i++) {
            int present = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    present = 1;
                    break;
                }
            }
            if (present == 1) {
                continue;
            }
            arr1[k] = nums1[i];
            k++;
        }

        k = 0;

        for (int i = 0; i < nums2.length; i++) {
            int present = 0;
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] == nums2[i]) {
                    present = 1;
                    break;
                }
            }
            if (present == 1) {
                continue;
            }
            arr2[k] = nums2[i];
            k++;
        }

        System.out.println("The two arrays are [" + Arrays.toString(arr1) + "," + Arrays.toString(arr2) + "]");
    }
}
