public class isomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    static boolean isIsomorphic(String s1, String s2) {
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i) + 256])
                return false;
            m[s1.charAt(i)] = m[s2.charAt(i) + 256] = i + 1;
        }
        return true;
    }
}
