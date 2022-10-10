public class breakAPalindrome {
    public static void main(String[] args) {
        String palindrome = "abccba";
        System.out.println(breakPalindrome(palindrome));
    }

    static String breakPalindrome(String palindrome) {
        if (palindrome.length() < 2) {
            return "";
        }
        char[] letters = palindrome.toCharArray();
        for (int i = 0; i < letters.length / 2; i++) {
            if (letters[i] != 'a') {
                letters[i] = 'a';
                return new String(letters);
            }
        }
        letters[letters.length - 1] = 'b';
        return new String(letters);
    }
}
