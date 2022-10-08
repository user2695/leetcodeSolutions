import java.util.Arrays;

public class _3SumClosest {
    public static void main(String[] args) {

        int[] nums = { -1, 2, 1, -4 };
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    static int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int lower = i + 1;
            int upper = nums.length - 1;
            while (lower < upper) {
                sum = nums[i] + nums[lower] + nums[upper];
                if (sum == target) {
                    return sum;
                } else if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                if (sum <= target) {
                    lower += 1;
                    while (nums[lower] == nums[lower - 1] && lower < upper) {
                        lower += 1;
                    }
                } else {
                    upper -= 1;
                }
            }
        }
        return closestSum;
    }
}
