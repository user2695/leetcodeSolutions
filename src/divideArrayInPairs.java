import java.util.Arrays;
import java.util.Stack;

public class divideArrayInPairs {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 2, 2, 2 };
        System.out.println(divideArray(nums));
    }

    static boolean divideArray(int[] nums) {
        Stack<Integer> st = new Stack<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (st.isEmpty()) {
                st.push(nums[i]);
            } else if (st.peek() == nums[i]) {
                st.pop();
            }
        }
        return (st.isEmpty())? true:false;
    }
}


//Using sets
// public boolean divideArray(int[] nums) {
//     Set<Integer> set = new HashSet<>();
//     for(int num : nums){
//         if(set.contains(num))   set.remove(num);
//         else    set.add(num);
//     }
//     return set.isEmpty();
// }