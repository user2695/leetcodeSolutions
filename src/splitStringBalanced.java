import java.util.Stack;

public class splitStringBalanced {
    public static void main(String[] args) {
        String str = "RLRRLLRLRL";
        System.out.println(splitString(str));
    }

    static int splitString(String s) {
        int count = 0;
        Stack<Character> list = new Stack<>();
        {
            for (int i = 0; i < s.length(); i++) {
                if (list.isEmpty())
                    list.push(s.charAt(i));

                else if (list.peek() == s.charAt(i))
                    list.push(s.charAt(i));

                else if (list.peek() != s.charAt(i)) {
                    list.pop();
                    if (list.isEmpty())
                        count++;
                }
            }
        }
        return count;
    }
}
