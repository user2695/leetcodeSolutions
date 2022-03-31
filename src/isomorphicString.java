import java.util.HashMap;

public class isomorphicString {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(checkIsomorphism(s, t));
    }

    static boolean checkIsomorphism(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sh = s.charAt(i);
            char th = t.charAt(i);
            if (map.containsKey(sh) == false) {
                if (map.containsValue(th) == true) {
                    return false;
                }
                map.put(sh, th);
            } else {
                if (map.get(sh) != th) {
                    return false;
                }
            }
        }
        return true;
    }
}
