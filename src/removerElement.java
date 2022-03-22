public class removerElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3, 5, 6, 7 };
        removeElement(nums, 3);
        for (int x = 0; x < nums.length; x++)
            System.out.print(nums[x] + " ");
    }

    static int[] removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return nums;
    }
}
