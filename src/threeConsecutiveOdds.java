public class threeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 4, 1 };
        System.out.println(threeConsecutiveOdd(arr));
    }

    static boolean threeConsecutiveOdd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = arr[i] % 2 == 1 ? count + 1 : 0;
            if (count == 3)
                return true;
        }
        return false;
    }
}
