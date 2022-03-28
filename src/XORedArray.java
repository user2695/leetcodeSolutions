public class XORedArray {
    public static void main(String[] args) {
        int[] encoded = { 6, 2, 7, 3 };
        int first = 4;
        decodeArray(encoded, first);
    }

    static void decodeArray(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

    }
}
