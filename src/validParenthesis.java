import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() == 0)
            return true;
        if (s.length() == 1)
            return false;
        if (s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']') {
            return false;
        } else {
            st.push(s.charAt(0));
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (st.isEmpty())
                    return false;
                else {
                    if (st.peek() == '{' && s.charAt(i) == '}' || st.peek() == '(' && s.charAt(i) == ')'
                            || st.peek() == '[' && s.charAt(i) == ']') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        if (st.isEmpty())
            return true;
        return false;
    }
}
