public class twoSum2 {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = new int[2];
        res = twoSum(numbers, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    static int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                ans[0] = l + 1;
                ans[1] = r + 1;
                return ans;
            } else if (numbers[l] + numbers[r] < target)
                l++;
            else
                r--;
        }
        return ans;
    }
}
