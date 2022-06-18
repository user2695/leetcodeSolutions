public class checkAllAsBeforeAllBs {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(checkString(s));
    }

    static boolean checkString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == 'b' && s.charAt(i) == 'a')
                return false;
        }
        return true;
    }
}
