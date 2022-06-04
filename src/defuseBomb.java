public class defuseBomb {
    public static void main(String[] args) {
        int[] code = { 5, 2, 2, 3, 1 };
        int k = 3;
        int[] ans = decrypt(code, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }

    static int[] decrypt(int[] code, int k) {
        int len = code.length;
        int arr[] = new int[len];
        if (k == 0)
            return arr;
        if (k > 0)
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(j + i) % len];
                }
                arr[i] = sum;
            }
        if (k < 0) {
            k = -1 * k;
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(len - j + i) % len];
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}
