public class flippingAnImage {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int ans[][] = flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println(" ");
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int[][] result = new int[row][col];

        // Step 1 : revert
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = image[i][col - j - 1];
            }
        }
        // Step 2: invert
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = result[i][j] == 1 ? 0 : 1;
            }
        }
        return result;
    }
}
