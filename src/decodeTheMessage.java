import java.util.HashMap;
import java.util.HashSet;

public class decodeTheMessage {
    public static void main(String[] args) {
        String message = "vkbs bs t suepuv";
        String key = "the quick brown fox jumps over the lazy dog";
        System.out.println(decodeMessage(key, message));
    }

    static String decodeMessage(String key, String message) {
        // Created a HashMap to store key with corresponding value
        HashMap<Character, Character> map = new HashMap<>();
        // Initailizing the char counter to letter 'a'
        char ch = 'a';
        for (int i = 0; i < key.length(); i++) {
            // Skiping if we encounter a space
            if (key.charAt(i) == ' ') {
                continue;
            }
            // Seacrhing the key if not present then adding it to HashMap
            if (!map.containsKey(key.charAt(i))) {
                // incrementing char counter ch to the next letter like from 'a' to 'b'
                map.put(key.charAt(i), ch++);
            }
        }
        // Creating a empty String to store answer
        String ans = "";
        for (int i = 0; i < message.length(); i++) {
            // If we encounter a Space then skipping the loop
            if (message.charAt(i) == ' ') {
                ans = ans + " ";
            } else {
                // taking the corresponding character value from HashMap and appendinf it to ans
                ans = ans + map.get(message.charAt(i));
            }
        }
        return ans;
    }
}
