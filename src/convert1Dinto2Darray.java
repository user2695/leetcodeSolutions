public class convert1Dinto2Darray {
    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4 };
        int m = 2, n = 2;
        int[][] ans = construct2DArray(original, m, n);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length)
            return new int[][] {};
        int[][] reshaped = new int[m][n];
        for (int i = 0; i < original.length; i++)
            reshaped[i / n][i % n] = original[i];
        return reshaped;
    }
}
