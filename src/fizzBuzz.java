import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fizzBuzzz(n));
    }

    static List<String> fizzBuzzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String current = "";
            if (i % 3 == 0) {
                current = "Fizz";
            }
            if (i % 5 == 0) {
                current += "Buzz";
            }
            if (current.length() == 0) {
                current = String.valueOf(i);
            }
            answer.add(current);
        }
        return answer;
    }
}
