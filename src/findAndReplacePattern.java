import java.util.ArrayList;
import java.util.List;

public class findAndReplacePattern {
    public static void main(String[] args) {
        String[] words = { "abc", "deq", "mee", "aqq", "dkd", "ccc" };
        String pattern = "abb";
        System.out.println(findAndReplacePatternn(words, pattern));
    }

    static List<String> findAndReplacePatternn(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern))
                res.add(word);
        }
        return res;
    }

    public static boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i)))
                return false;
        }
        return true;

    }
}
