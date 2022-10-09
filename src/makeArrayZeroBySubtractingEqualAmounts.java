import java.util.HashSet;
import java.util.Set;

// You are given a non-negative integer array nums.
// In one operation, you must:
// Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
// Subtract x from every positive element in nums.
// Return the minimum number of operations to make every element in nums equal to 0.

public class makeArrayZeroBySubtractingEqualAmounts {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 0, 3, 5 };
        System.out.println(minimumOperations(nums));
    }

    static int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums)
            if (a > 0)
                set.add(a);
        return set.size();
    }
}
