public class minimumTimeVisitingAllPoints {
    public static void main(String[] args) {
        int[][] points = { { 1, 1 }, { 3, 4 }, { -1, 0 } };
        System.out.println(minTimeToVisitAllPoints(points));
    }

    static int minTimeToVisitAllPoints(int[][] points) {

        int count = 0;
        for (int i = 1; i < points.length; i++) {
            int val = Math.max(Math.abs(points[i][0] - points[i - 1][0]),
                    Math.abs(points[i][1] - points[i - 1][1]));
            count += val;
        }

        return count;
    }
}
