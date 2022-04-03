import java.util.Arrays;

public class maxProduct {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 5 };
        System.out.println(maximumProduct(arr));
    }

    static int maximumProduct(int[] nums) {
        int val = 0;
        Arrays.sort(nums);
        int i = nums.length - 1;
        int j = nums.length - 2;
        val = (nums[i] - 1) * (nums[j] - 1);
        return val;
    }
}
