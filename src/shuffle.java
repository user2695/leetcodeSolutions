public class shuffle {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        int n = nums.length;
        shufflee(nums, n);
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }

    static int[] shufflee(int[] nums, int n) {
        n = nums.length;
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                result[i] = nums[i / 2];
            else
                result[i] = nums[n + i / 2];
        }
        return result;
    }
}
