import java.util.ArrayList;
import java.util.List;

public class decompressEncodedList {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = new int[nums.length];
        ans = decompressRLElist(nums);
        for (int i = 0; i < ans.length; i++)
            System.out.println(ans[i]);
    }

    static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            int count = nums[i];
            int value = nums[i + 1];
            for (int j = 0; j < count; j++) {
                list.add(value);
            }
        }
        int[] array = new int[list.size()];
        for (int x = 0; x < list.size(); x++)
            array[x] = list.get(x);
        return array;
    }
}
