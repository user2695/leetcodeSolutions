public class validAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {
        int[] charsMap = new int['z' - 'a' + 1];

        for (char c : s.toCharArray()) {
            int pos = c - 'a';
            charsMap[pos]++;
        }

        for (char c : t.toCharArray()) {
            int pos = c - 'a';
            charsMap[pos]--;
        }

        for (int count : charsMap) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
