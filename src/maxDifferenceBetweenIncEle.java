public class maxDifferenceBetweenIncEle {

    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 4 };
        System.out.println(maximumDifference(nums));
    }

    static int maximumDifference(int[] nums) {
        int min = nums[0];
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            ans = Math.max(ans, nums[i] - min);
        }
        return ans > 0 ? ans : -1;
    }
}