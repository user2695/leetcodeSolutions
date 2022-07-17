import java.util.ArrayList;
import java.util.HashMap;

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int ans[] = new int[nums1.length];
        ans = intersect(nums1, nums2);
        for (int i = 0; i < ans.length; i++)
            System.out.println(ans[i]);
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) != 0) {
                al.add(i);
                map.put(i, map.getOrDefault(i, 1) - 1);
            }
        }
        int[] arr = new int[al.size()];
        int k = 0;
        for (int i : al)
            arr[k++] = i;
        return arr;
    }
}
