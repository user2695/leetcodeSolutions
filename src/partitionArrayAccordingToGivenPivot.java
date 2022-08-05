public class partitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] nums = { 9, 12, 5, 10, 14, 3, 10 };
        int pivot = 10;
        int ans[] = new int[nums.length];
        ans = pivotArray(nums, pivot);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[left++] = nums[i];
            }
            if (nums[nums.length - 1 - i] > pivot) {
                result[right--] = nums[nums.length - 1 - i];
            }
        }

        while (left <= right) {
            result[left++] = pivot;
            result[right--] = pivot;
        }

        return result;
    }
}
