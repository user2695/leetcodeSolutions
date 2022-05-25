public class reverseWordInString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        String ans = "";
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder str = new StringBuilder(arr[i]);
            ans = ans + str.reverse().toString() + " ";
        }
        return ans.substring(0, ans.length() - 1);
    }
}
