public class combinationSum4 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int target = 4;
        System.out.println(permutations(nums, target, new Integer[target + 1]));
    }

    public static int permutations(int[] nums, int target, Integer[] qb) {

        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }
        if (qb[target] != null) {
            return qb[target];
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += permutations(nums, target - nums[i], qb);
        }
        return qb[target] = count;
    }
}
