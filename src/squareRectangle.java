public class squareRectangle {
    public static void main(String[] args) {
        int[][] rectangles = { { 5, 8 }, { 3, 9 }, { 5, 12 }, { 16, 5 } };
        System.out.println(countGoodRectangles(rectangles));
    }

    static int countGoodRectangles(int[][] rectangles) {
        int count = 0, max = 0;
        for (int[] recPair : rectangles) {
            int min = Math.min(recPair[0], recPair[1]);
            if (min > max) {
                max = min;
                count = 1;
            }

            else if (min == max)
                count++;
        }
        return count;
    }
}