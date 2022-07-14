import java.util.HashSet;
import java.util.Set;

public class morseCodeWords {
    public static void main(String[] args) {
        String[] words = { "gin", "zen", "gig", "msg" };
        System.out.println(uniqueMorseRepresentations(words));
    }

    static int uniqueMorseRepresentations(String[] words) {
        String[] tokens = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--.." };
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(tokens[word.charAt(i) - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
