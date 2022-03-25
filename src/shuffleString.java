public class shuffleString {
    public static void main(String[] args) {
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String s = "codeleet";
        char res[] = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j]);
        }
    }
}
