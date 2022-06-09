import java.util.Arrays;

public class sortArrayByparity {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        int[] ans = sortArayByParity(nums);
        for (int i = 0; i < ans.length; i++)
            System.out.println(ans[i]);
    }

    static int[] sortArayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i, j;
        int k = ans.length - 1;
        Arrays.sort(nums);
        for (i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                ans[j++] = nums[i];
            else
                ans[k--] = nums[i];
        }
        return ans;
    }
}
