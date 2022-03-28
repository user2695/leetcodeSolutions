public class XORedArray {
    public static void main(String[] args) {
        int[] encoded = { 1, 2, 3 };
        int first = 1;
        int[] ans = new int[encoded.length + 1];
        ans = decodeArray(encoded, first);
        for (int i = 0; i < ans.length; i++)
            System.out.println(ans[i]);
    }

    static int[] decodeArray(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }
}
