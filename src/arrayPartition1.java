class arrayPartition1 {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 2 };
        System.out.println(arrayPairSum(nums));
    }

    static int arrayPairSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2)
            sum += nums[i];
        return sum;
    }
}