public class removePalindromicSubsequence {
    public static void main(String[] args) {
        String s = "abb";
        System.out.println(removePalindromeSub(s));
    }

    static int removePalindromeSub(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return 2;
            }
        }
        return 1;
    }
}
