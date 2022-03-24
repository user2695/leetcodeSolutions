import java.util.ArrayList;
import java.util.List;

public class maxCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 3, 1 };
        int n = 2;
        kidsWithCandies(candies, n);

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for (int candy : candies)
            max = Math.max(max, candy);
        for (int candy : candies)
            result.add(candy + extraCandies >= max);
        System.out.println(result);
        return result;

    }
}