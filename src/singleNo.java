public class singleNo {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(arr));
    }

    static int singleNumber(int[] nums) {
        int sum = 0;
        for (int i : nums)
            sum ^= i;
        return sum;
    }
}
