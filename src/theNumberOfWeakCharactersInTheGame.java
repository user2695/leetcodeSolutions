import java.util.Arrays;

public class theNumberOfWeakCharactersInTheGame {
    public static void main(String[] args) {
        int[][] properties = { { 1, 5 }, { 10, 4 }, { 4, 3 } };
        System.out.println(numberOfWeakCharacters(properties));
    }

    static int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : b[0] - a[0]);
        int max = -1, res = 0;
        for (int[] property : properties) {
            if (property[1] < max)
                res++;
            else
                max = property[1];
        }
        return res;
    }
}
