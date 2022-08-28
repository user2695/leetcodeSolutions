public class sortTheMatrixDiagonally {
    public static void main(String[] args) {
        int[][] mat = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
        int[][] ans = diagonalSort(mat);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] diagonalSort(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++)
            countSort(mat, 0, i);

        for (int i = 1; i < mat.length; i++)
            countSort(mat, i, 0);

        return mat;

    }

    static void countSort(int[][] mat, int r, int c) {
        int[] map = new int[101];
        int rows = mat.length, cols = mat[0].length;
        int i = r, j = c;

        while (i < rows && j < cols) {
            map[mat[i][j]]++;
            i++;
            j++;
        }
        i = r;
        j = c;
        for (int k = 1; k < 101; k++) {
            while (map[k] > 0) {
                mat[i][j] = k;
                map[k]--;
                i++;
                j++;
            }
        }
    }
}
