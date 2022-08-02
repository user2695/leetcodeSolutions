public class increasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 5, 0, 4, 6 };
        System.out.println(increasingTriplet(nums));
    }

    static boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        if (nums.length < 3)
            return false;
        for (int in = 0; in < nums.length; in++) {
            if (nums[in] < i) {
                i = nums[in];
            } else if (nums[in] < j) {
                j = nums[in];
            } else {
                return true;
            }
        }
        return false;
    }
}
