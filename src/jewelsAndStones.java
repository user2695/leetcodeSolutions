import java.util.HashSet;

public class jewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i)))
                count++;

        }
        return count;
    }
}
