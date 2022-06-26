import java.util.HashSet;
import java.util.Set;

public class Longestpalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        int baseSize = s.length() - set.size();
        if (set.size() != 0)
            return baseSize + 1;
        return baseSize;
    }
}
