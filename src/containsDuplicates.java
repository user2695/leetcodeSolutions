import java.util.HashMap;
import java.util.Map;

public class containsDuplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(containsNearbyDuplicate(arr, 3));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                int idx = map.get(nums[i]);
                if (Math.abs(i - idx) <= k) {
                    return true;
                }
                map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
}
