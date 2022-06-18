public class percentageLetter {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetterr(s, letter));
    }

    static int percentageLetterr(String s, char letter) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter)
                count++;
        }
        return (count * 100) / s.length();
    }
}
