import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class twoOutOfThree {
    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 3, 2 };
        int[] nums2 = { 2, 3 };
        int[] nums3 = { 3 };
        System.out.println(twoOutOfThre(nums1, nums2, nums3));
    }

    static List<Integer> twoOutOfThre(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i : nums1)
            set.add(i);
        for (int i : nums2)
            if (set.contains(i))
                result.add(i);
        for (int i : nums2)
            set.add(i);
        for (int i : nums3)
            if (set.contains(i))
                result.add(i);
        List<Integer> ans=new ArrayList<>(result);
        return ans;
    }
}