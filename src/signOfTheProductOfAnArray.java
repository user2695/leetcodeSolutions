public class signOfTheProductOfAnArray {
    public static void main(String[] args) {
        int[] nums = { -1, -2, -3, -4, 3, 2, 1 };
        System.out.println(arraySign(nums));
    }

    static int arraySign(int[] nums) {
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            int val = signFunc(nums[i]);
            prod *= val;
        }
        return prod;
    }

    static int signFunc(int x) {
        if (x < 0)
            return -1;
        else if (x > 0)
            return 1;
        return 0;
    }
}
