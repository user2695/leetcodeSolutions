import java.util.ArrayList;
import java.util.List;

public class maxCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 3, 1 };
        int n = 2;
        kidsWithCandies(candies, n);

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>(candies.length);
        int max = 0;
        for (int candy : candies)
            max = Math.max(max, candy);
        for (int candy : candies)
            arr.add(candy + extraCandies >= max);
        System.out.println(arr);
        return arr;

    }
}