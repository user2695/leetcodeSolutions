public class maxSubArraySum {
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int maxSum = nums[0], curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            if (curSum > maxSum)
                maxSum = curSum;
            if (curSum < 0)
                curSum = 0;
        }
        return maxSum;
    }
}
