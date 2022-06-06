public class distanceValBetweenArrays {
    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 100, 3 };
        int[] arr2 = { -5, -2, 10, -3, 7 };
        int d = 6;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }

    static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            int flag = 1;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    flag = 0;
                }
            }
            if (flag == 1) {
                count++;
            }
        }
        return count;
    }
}
