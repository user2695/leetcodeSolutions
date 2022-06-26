public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        int[] cardPoints = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }
    static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, totalSum = 0, minSubarray = 0;
        for (int i=0, currSum=0; i<n; i++) {
            totalSum += cardPoints[i];
            currSum += cardPoints[i];
            if (i < n-k) minSubarray += cardPoints[i];
            else {
                currSum -= cardPoints[i-(n-k)];
                minSubarray = Math.min(minSubarray, currSum);
            }
        }
    
        return totalSum - minSubarray; 
    }
}
