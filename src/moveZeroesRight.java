public class moveZeroesRight {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 6, 0, 3, 0, 2, 0, 6, 8, 4, 6, 3, 2, 0, 3 };
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    static void moveZeroes(int[] nums) {
        int l = 0;
        int r = 1;
        while (r < nums.length) {
            if (nums[l] != 0) {
                r++;
                l++;
            } else if (nums[r] == 0) {
                r++;
            } else {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
            }

        }

    }

}
