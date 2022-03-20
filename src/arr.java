public class arr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] res = new int[6];
        for (int i = 0; i < 3; i++) {
            res[i] = arr[i];
        }
        for (int i = 3, j = 0; i < 6; i++, j++) {
            res[i] = arr[j];
        }
        for (int x = 0; x < 6; x++) {
            System.out.print(res[x]);
        }

    }
}
