public class pairsWithAbsoluteDiff {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 4 };
        int k = 2;
        System.out.println(countKDifference(nums, k));
    }

    static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
