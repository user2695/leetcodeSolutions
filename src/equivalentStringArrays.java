public class equivalentStringArrays {
    public static void main(String[] args) {
        String[] s1 = { "a", "bcd" };
        String[] s2 = { "ab", "cd" };

        System.out.println(arrayStringsAreEqual(s1, s2));
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String word : word1)
            sb1.append(word);

        for (String word : word2)
            sb2.append(word);

        return sb1.toString().equals(sb2.toString());
    }
}
