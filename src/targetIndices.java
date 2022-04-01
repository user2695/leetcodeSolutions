import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetIndices {
    public static void main(String[] args) {
        int[] nums = { 1,2,5,2,3 };
        int target = 5;
        System.out.println(targetIndicesCheck(nums, target));
    }

    static List<Integer> targetIndicesCheck(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
