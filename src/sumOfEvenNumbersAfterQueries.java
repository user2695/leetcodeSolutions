public class sumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int queries[][] = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
        int[] ans = new int[nums.length];
        ans = sumEvenAfterQueries(nums, queries);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
    }

    static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        for (int a : A) {
            sum += (a % 2 == 0 ? a : 0);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < ans.length; ++i) {
            int idx = queries[i][1];
            if (A[idx] % 2 == 0) {
                sum -= A[idx];
            }
            A[idx] += queries[i][0];
            if (A[idx] % 2 == 0) {
                sum += A[idx];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
