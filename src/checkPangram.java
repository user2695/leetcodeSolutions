import java.util.HashSet;
import java.util.Set;

public class checkPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        char arr[] = sentence.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        if (set.size() == 26) {
            return true;
        }
        return false;
    }
}
