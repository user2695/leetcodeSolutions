import java.util.Arrays;

class kthSmallestElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }

    static int kthSmallest(int[][] matrix, int k) {
        int[] list = new int[matrix.length * matrix[0].length];
        int l = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                list[l++] = matrix[i][j];
            }
        }
        Arrays.sort(list);
        return list[k - 1];
    }
}