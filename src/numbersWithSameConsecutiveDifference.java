import java.util.ArrayList;
import java.util.List;

public class numbersWithSameConsecutiveDifference {
    public static void main(String[] args) {
        int n = 3, k = 7;
        int[] ans = numsSameConsecDiff(n, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static void dfs(int num, int digit, int n, int k, List<Integer> numbers) {
        if (n == 0) {
            numbers.add(num);
            return;
        }
        if (digit + k <= 9) {
            dfs(num * 10 + (digit + k), digit + k, n - 1, k, numbers);
        }
        if (k != 0 && digit - k >= 0) {
            dfs(num * 10 + (digit - k), digit - k, n - 1, k, numbers);
        }
    }

    public static int[] numsSameConsecDiff(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        for (int num = 1; num < 10; num++) {
            dfs(num, num, n - 1, k, numbers);
        }

        int[] answer = new int[numbers.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }
}
