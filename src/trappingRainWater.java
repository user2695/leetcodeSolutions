public class trappingRainWater {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trap(height));
    }

    static int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int sum = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (l < r) {
            if (height[l] > leftMax)
                leftMax = height[l];

            if (height[r] > rightMax)
                rightMax = height[r];

            if (leftMax < rightMax) {
                sum += Math.max(0, leftMax - height[l]);
                l++;
            } else {
                sum += Math.max(0, rightMax - height[r]);
                r--;
            }
        }
        return sum;
    }
}
