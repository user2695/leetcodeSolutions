public class rotateArray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        leftRotate(arr, 2, 7);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    static void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotatebyOne(arr, n);
        }
    }

    static void leftRotatebyOne(int arr[], int n) {
        int temp, i;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = temp;
    }
}
