public class smallerNumsThanCurrent {
    public static void main(String[] args) {
        int nums[] = { 8, 1, 2, 2, 3 };
        numsSmaller(nums);

    }

    static int[] numsSmaller(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;

                }
                ans[i] = count;
            }

        }
        printAns(ans);
        return ans;
    }

    static void printAns(int[] ans) {
        for (int x = 0; x < ans.length; x++)
            System.out.println(ans[x]);
    }

}
