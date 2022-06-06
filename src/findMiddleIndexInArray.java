public class findMiddleIndexInArray {
    public static void main(String[] args) {
        int[] nums = { 2, 3, -1, 8, 4 };
        System.out.println(findMiddleIndex(nums));
    }

    static int findMiddleIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (sum == sum1) {
                return i;
            }
            sum1 += nums[i];
        }
        return -1;
    }
}
