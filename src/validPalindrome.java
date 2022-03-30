
public class validPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(s));
    }

    static boolean checkPalindrome(String s) {
        s = s.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;

        }
        return true;
    }
}
