public class firstPalindrome {
    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        System.out.println(firstPalindrom(words));
    }

    static String firstPalindrom(String[] words) {
        for (int i = 0; i < words.length; i++) {
            StringBuilder input1 = new StringBuilder(words[i]);
            String s = input1.reverse().toString();
            if (words[i].equals(s)) {
                return words[i];
            }
        }
        return "";
    }

}
