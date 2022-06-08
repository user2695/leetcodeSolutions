public class countPrefixOfString {
    public static void main(String[] args) {
        String[] words = { "feh", "w", "w", "lwd", "c", "s", "vk", "zwlv", "n", "w", "sw", "qrd", "w", "w", "mqe", "w",
                "w", "w", "gb", "w", "qy", "xs", "br", "w", "rypg", "wh", "g", "w", "w", "fh", "w", "w", "sccy" };
        String s = "w";
        System.out.println(countPrefixes(words, s));
    }

    static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String i : words) {
            if (s.startsWith(i))
                count++;
        }
        return count;     
    }
}
