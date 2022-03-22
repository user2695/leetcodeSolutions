public class searchIncertElement {
    public static void main(String[] args) {
        int target = 5;
        int nums[] = { 1, 3, 5, 6 };
        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else
                h = mid - 1;
        }
        return l;
    }
}
