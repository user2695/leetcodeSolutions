public class richestCustomer {
    public static void main(String[] args) {

        int[][] accounts = { { 3, 1, 3, 5, 2, 2, 3 }, { 3, 2, 0, 0, 2, 1, 4 } };

        System.out.println(maxVal(accounts));
    }

    static int maxVal(int[][] accounts) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
