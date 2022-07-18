public class reshapeTheMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2 }, { 3, 4 } };
        int r = 2;
        int c = 4;
        int ans[][] = matrixReshape(mat, r, c);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (r * c != m * n)
            return mat;
        int[][] reshaped = new int[r][c];
        for (int i = 0; i < r * c; i++)
            reshaped[i / c][i % c] = mat[i / n][i % n];
        return reshaped;
    }
}
