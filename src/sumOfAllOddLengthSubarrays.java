public class sumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 5, 3 };
        System.out.println(sumOddLengthSubarrays(arr));
    }

    static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0, l = arr.length;
        for (int i = 0; i < l; i++)
            sum += (((i + 1) * (l - i) + 1) / 2) * arr[i];
        return sum;
    }
}
