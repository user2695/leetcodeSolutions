import java.util.HashMap;

public class commonWordsOccurence {
    public static void main(String[] args) {
        String[] args1 = { "leetcode", "is", "amazing", "as", "is" };
        String[] args2 = { "amazing", "leetcode", "is" };
        System.out.println(countWords(args1, args2));
    }

    static int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String word : words1)
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        for (String word : words2)
            map2.put(word, map2.getOrDefault(word, 0) + 1);

        int count = 0;
        for (String word : words1)
            if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1)
                count++;
        return count;
    }
}
