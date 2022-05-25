public class reverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reversString(s);
        for (int i = 0; i < s.length; i++)
            System.out.print(s[i]);
    }

    static void reversString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < s.length / 2) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
