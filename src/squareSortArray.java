import java.util.Arrays;

class squareSortArray {
    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };
        int ans[] = new int[nums.length];
        ans = sortedSquares(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(ans[i]);
        }
    }

    static int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}