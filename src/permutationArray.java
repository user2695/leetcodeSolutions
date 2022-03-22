public class permutationArray {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 5, 3, 4 };
        buildArray(arr);
        for (int i : arr) {
            System.out.println(arr[i]);
        }

    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
