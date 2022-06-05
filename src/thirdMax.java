import java.util.Arrays;
import java.util.LinkedHashSet;

public class thirdMax {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 1 };
        System.out.println(thirdMaxx(nums));
    }

    static int thirdMaxx(int[] nums) {
        Arrays.sort(nums);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        Object[] ans = set.toArray();
        if (ans.length < 3) {
            return (int) ans[ans.length - 1];
        }
        return (int) ans[ans.length - 3];
    }
}
