public class DIstringMatch {
    public static void main(String[] args) {
        String s = "IDID";
        int[] arr = new int[s.length() + 1];
        arr = diStringMatch(s);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    static int[] diStringMatch(String s) {
        int[] arr = new int[s.length() + 1];
        int l = 0;
        int r = s.length();
        for (int i = 0; i < arr.length - 1; i++) {
            if (s.charAt(i) == 'I') {
                arr[i] = l;
                l++;
            } else {
                arr[i] = r;
                r--;
            }
        }
        arr[arr.length - 1] = l;
        return arr;
    }
}
