public class runningSum {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        runingSum(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
    static int[] runingSum(int nums[]) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            nums[i] = sum;

        }
        return nums;
    }
}
