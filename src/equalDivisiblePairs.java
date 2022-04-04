public class equalDivisiblePairs {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4 };
        int k = 1;
        System.out.println(countPairs(arr, k));
    }

    static int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
