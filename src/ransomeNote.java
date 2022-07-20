public class ransomeNote {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        boolean ans = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0; j < magazine.length(); j++) {
                if (ransomNote.charAt(i) == magazine.charAt(j)) {
                    continue;
                } else if (ransomNote.charAt(i) != magazine.charAt(j)) {
                    ans = false;
                }
            }
        }
        return ans;
    }
}
