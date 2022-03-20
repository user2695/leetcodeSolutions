public class arrayForK {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 7, 3, 5 };
        int k = 20;
        System.out.println(getMinLength(arr, k));
    }

    static int getMinLength(int arr[], int k) {
        int i = 0;
        int j = 1;
        if (arr[i] * arr[j] <= k) {
            arr[i] = arr[i] * arr[j];
            j++;
        } else {
            i++;
            j++;
        }

        return arr.length;
    }
}
