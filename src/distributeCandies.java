import java.util.HashSet;

public class distributeCandies {
    public static void main(String[] args) {
        int[] candyType = { 6, 6, 6, 6 };
        System.out.println(distributeCandiess(candyType));
    }

    static int distributeCandiess(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        int ans = candyType.length / 2;
        if (set.size() < ans)
            return set.size();
        else
            return ans;
    }
}
