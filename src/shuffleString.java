public class shuffleString {
    public static void main(String[] args) {
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String s = "codeleet";
        System.out.println(shuffleStr(indices, s));
    }

    static char[] shuffleStr(int[] indices, String s) {
        char res[] = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return res;
    }
}
