import java.util.HashSet;

public class containsDupli {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
