public class singleNo {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        int sum = 0;
        for (int i : nums)
            sum ^= i;
        return sum;
    }
}
