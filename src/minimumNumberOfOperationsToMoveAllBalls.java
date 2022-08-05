class minimumNumberOfOperationsToMoveAllBalls {
    public static void main(String[] args) {
        String boxes = "001011";
        int[] ans = new int[boxes.length()];
        ans = minOperations(boxes);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int res = 0;

        for (int i = 0; i < boxes.length(); i++) {
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1') {
                    res = res + Math.abs(j - i);
                    ans[i] = res;
                }
            }
            res = 0;
        }
        return ans;
    }
}