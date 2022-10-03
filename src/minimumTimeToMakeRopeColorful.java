public class minimumTimeToMakeRopeColorful {
    public static void main(String[] args) {
        String colors = "aabaa";
        int[] neededTime = { 1, 2, 3, 4, 1 };
        System.out.println(minCost(colors, neededTime));
    }

    static int minCost(String colors, int[] neededTime) {
        int time = 0;
        for (int i = 1, j = 0; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(j)) {
                if (neededTime[i] > neededTime[j]) {
                    time += neededTime[j];
                    j = i;
                } else {
                    time += neededTime[i];
                }
            } else {
                j = i;
            }
        }
        return time;
    }
}
