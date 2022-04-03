import java.util.Arrays;

public class maxProductDiff {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 2, 7, 4 };
        System.out.println(maxProductDifference(arr));
    }

    static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int res = nums[nums.length-1] * nums[nums.length - 2] - nums[0] * nums[1];
        return res;
    }

}
