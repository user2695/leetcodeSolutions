import java.util.Arrays;

public class multiplyingFoundVals {
    public static void main(String[] args) {
        int[] nums = { 8, 19, 4, 2, 15, 3 };
        int original = 2;
        System.out.println(findFinalValue(nums, original));
    }

    static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original) {
                original = original * 2;

            }
        }
        return original;
    }
}
