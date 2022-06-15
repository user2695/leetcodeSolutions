public class toLowerCase {
    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println(toLowerCasee(s));
    }

    static String toLowerCasee(String s) {
        char[] ans = s.toCharArray();
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] <= 90 && ans[i] >= 65) {
                ans[i] += 32;
            }
        }
        return new String(ans);
    }
}
