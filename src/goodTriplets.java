public class goodTriplets {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 1, 9, 7 };
        int a = 7, b = 2, c = 3;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }

    static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int i, j, k, count = 0;
        for (i = 0; i < (arr.length) - 2; i++)
            for (j = i + 1; j < (arr.length) - 1; j++)
                if (Math.abs(arr[i] - arr[j]) <= a)
                    for (k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b)
                            if (Math.abs(arr[i] - arr[k]) <= c)
                                count++;
                    }
        return count;
    }
}
