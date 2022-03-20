public class maxRainwater {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2 };
        System.out.println(maxWat(height));
    }

    static int maxWat(int height[]) {
        int totalWater = 0;
        for (int p = 0; p < height.length; p++) {
            int leftP = p, rightP = p;
            int leftMax = 0, rightMax = 0;
            while (leftP >= 0) {
                leftMax = Math.max(leftMax, height[leftP]);
                leftP--;
            }
            while (rightP < height.length) {
                rightMax = Math.max(rightMax, height[rightP]);
                rightP++;
            }
            int currWater = Math.min(leftMax, rightMax) - height[p];
            if (currWater >= 0) {
                totalWater = totalWater + currWater;
            }
        }
        return totalWater;
    }

}
