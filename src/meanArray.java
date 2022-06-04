import java.util.Arrays;

class meanArray {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0 };
        System.out.println(trimMean(arr));
    }

    static double trimMean(int[] arr) {
        int cut = arr.length / 20;
        Arrays.sort(arr);
        double sum = 0;
        double mean = 0;
        for (int i = cut; i < arr.length - cut; i++) {
            sum += arr[i];
            mean = sum / (arr.length - (2 * cut));
        }
        return mean;
    }
}