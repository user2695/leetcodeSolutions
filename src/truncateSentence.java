public class truncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentenc(s, k));
    }

    public static String truncateSentenc(String s, int k) {
        StringBuilder builder = new StringBuilder();
        int spaces = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {
                ++spaces;
                if (spaces == k) {
                    builder.append(s.substring(0, i));
                    break;
                }
            }
        }
        if (spaces < k)
            return s;
        return builder.toString();
    }
}
