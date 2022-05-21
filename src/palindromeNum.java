public class palindromeNum {
    public static void main(String[] args) {
        int x = 123123;
        System.out.println(checkPalindrome(x));
    }

    static boolean checkPalindrome(int x) {
           String s = Integer.toString(x);
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) != s.charAt(s.length()-i-1))
                    return false;
        }
        return true;
    }
}
