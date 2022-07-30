import java.util.ArrayList;
import java.util.List;

public class wordSubsets {
    public static void main(String[] args) {
        String[] words1 = { "amazon", "apple", "facebook", "google", "leetcode" };
        String[] words2 = { "e", "o" };
        System.out.println(wordSubset(words1, words2));
    }

    static List<String> wordSubset(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] target = new int[26];

        for (String word : words2) {
            int[] temp = new int[26];
            for (char ch : word.toCharArray()) {
                temp[ch - 'a']++;
                target[ch - 'a'] = Math.max(target[ch - 'a'], temp[ch - 'a']);
            }
        }

        for (String word : words1) {
            int[] source = new int[26];
            for (char ch : word.toCharArray()) {
                source[ch - 'a']++;
            }

            if (subset(source, target)) {
                result.add(word);
            }
        }

        return result;
    }

    public static boolean subset(int[] parent, int[] child) {
        for (int i = 0; i < 26; i++) {
            if (parent[i] < child[i])
                return false;
        }
        return true;
    }
}
