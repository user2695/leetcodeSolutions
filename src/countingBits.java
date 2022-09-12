public class countingBits {
    public static void main(String[] args) {
        int n = 2;
        int ans[] = new int[n + 1];
        ans = countBit(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    static int[] countBit(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;

        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 0) {
                res[i] = res[i >> 1];
            } else {
                res[i] = res[i - 1] + 1;
            }
        }

        return res;
    }
}
