import java.util.HashSet;

public class consistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        System.out.println(countConsistentStrings(allowed, words));
    }

    static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (Character ch : allowed.toCharArray()) {
            set.add(ch);
        }

        for (String str : words) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (set.contains(ch) == false) {
                    break;
                }
                if (i == str.length() - 1) {
                    count++;
                }
            }
        }
        return count;

    }
}
