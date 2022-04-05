import java.util.Arrays;

public class heigthChecker {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(nums));
    }

    static int heightChecker(int[] heights) {
        int arr[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != heights[i]) {
                count += 1;
            }
        }
        return count;
    }
}
