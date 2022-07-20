public class firstUniqueCharacterInAstring {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }

    static int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            int ind = s.indexOf(i);
            if (ind != -1 && ind == s.lastIndexOf(i))
                ans = Math.min(ans, ind);
        }
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
