import java.util.*;

public class ArrayIntersect {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        HashMap<Integer, Integer> count1 = new HashMap<>();

        for (int num : nums1) {
            count1.put(num, count1.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (count1.containsKey(num) && count1.get(num) > 0) {
                result.add(num);
                count1.put(num, count1.get(num) - 1);
            }
        }

        System.out.println(result);
    }
}