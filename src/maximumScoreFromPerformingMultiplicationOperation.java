public class maximumScoreFromPerformingMultiplicationOperation {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 }, multipliers = { 3, 2, 1 };
        System.out.println(maximumScore(nums, multipliers));
    }

    static int maximumScore(int[] nums, int[] multipliers) {
        return maxScore(nums, multipliers, 0, 0, new Integer[multipliers.length][multipliers.length]);
    }

    private static int maxScore(int[] nums, int[] multipliers, int nStart, int m, Integer[][] dp) {
        if (m == multipliers.length)
            return 0;

        if (dp[nStart][m] != null)
            return dp[nStart][m];

        int nEnd = (nums.length - 1) - (m - nStart);
        return dp[nStart][m] = Math.max(
                nums[nStart] * multipliers[m] + maxScore(nums, multipliers, nStart + 1, m + 1, dp),
                nums[nEnd] * multipliers[m] + maxScore(nums, multipliers, nStart, m + 1, dp));
    }
}
