public class deleteColumns {
    public static void main(String[] args) {
        String strs[] = { "cba", "daf", "ghi" };
        System.out.println(minDeletionSize(strs));
    }

    static int minDeletionSize(String[] strs) {
        int ans = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            char previous = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < previous) {
                    ans += 1;
                    break;
                }
                previous = strs[j].charAt(i);
            }
        }
        return ans;
    }
}
