public class maxSentence {
    public static void main(String[] args) {
        String[] sentences = { "alice and bob love leetcode and done can be first sentence", "i think so too",
                "this is great thanks very much" };
        System.out.println(maxWords(sentences));
    }

    public static int maxWords(String[] sentences) {
        int length = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            length = Math.max(length, s.length);
        }
        return length;
    }
}
