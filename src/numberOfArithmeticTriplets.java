import java.util.HashSet;
import java.util.Set;

public class numberOfArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 4, 6, 7, 10 };
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));
    }

    static int arithmeticTriplets(int[] nums, int diff) {
        // int count=0;
        // for(int i=0;i<nums.length-2;i++){
        // for(int j=1;j<nums.length-1;j++){
        // for(int k=2;k<nums.length;k++){
        // if(nums[k]-nums[j]==diff && nums[j]-nums[i]==diff){
        // count+=1;
        // }
        // }
        // }
        // }
        // return count;

        Set<Integer> seen = new HashSet<>();
        int cnt = 0;
        for (int num : nums) {
            seen.add(num);
            if (seen.contains(num - diff) && seen.contains(num - 2 * diff))
                cnt++;
        }
        return cnt;

    }
}
