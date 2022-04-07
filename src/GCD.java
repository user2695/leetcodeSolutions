import java.util.Arrays;

public class GCD {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 9, 10 };
        System.out.println(findGCD(nums));
    }

    static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans = recursiveGCD(nums[0], nums[nums.length - 1]);
        return ans;
    }

    public static int recursiveGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return recursiveGCD(b, a % b);
        }
    }
}