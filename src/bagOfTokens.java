import java.util.Arrays;

public class bagOfTokens {
    public static void main(String[] args) {
        int[] tokens = { 100, 200, 300, 400 };
        int power = 200;
        System.out.println(bagOfTokensScore(tokens, power));
    }

    static int bagOfTokensScore(int[] tokens, int P) {
        int score = 0;
        Arrays.sort(tokens);

        if (tokens.length == 0 || tokens[0] > P)
            return score;

        int left = 0, right = tokens.length - 1;
        int tempScore = 0;
        while (left <= right) {
            if (tokens[left] <= P) {
                tempScore++;
                P -= tokens[left++];
            } else if (tokens[right] <= P) {
                tempScore++;
                P -= tokens[right--];
            } else {
                if (tokens[left] > tokens[right])
                    P += tokens[left++];
                else
                    P += tokens[right--];
                tempScore--;
            }
            score = Math.max(tempScore, score);
        }
        return score;
    }
}
