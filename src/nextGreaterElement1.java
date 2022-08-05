import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        int[] ans = new int[nums1.length];
        ans = nextGreaterElement(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.add(num);
        }
        int i = 0;
        for (int num : nums1) {
            ans[i++] = map.getOrDefault(num, -1);
        }
        return ans;
    }
}
