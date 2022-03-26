public class missingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 6, 0 };
        System.out.println(missingNum(arr));
    }

    static int missingNum(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int i : nums)
            sum = sum - i;
        return sum;
    }
}
