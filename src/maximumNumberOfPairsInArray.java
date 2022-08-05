import java.util.HashSet;

public class maximumNumberOfPairsInArray {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 1, 3, 2, 2 };
        int[] ans = numberOfPairs(nums);
        for (int i = 0; i < ans.length; i++)
            System.out.println(ans[i]);
    }

    static int[] numberOfPairs(int[] nums) {
        if(nums.length<2)
        return new int[]{0,1};
        
        HashSet<Integer> set = new HashSet<>();
        int pairs = 0;
        for(int i : nums){
            if(!set.contains(i)){
               set.add(i);            // No pair present 
            }else{
              set.remove(i);          // Pair found 
              pairs++;                                              
            }
        }
        
        return new int[]{pairs,set.size()};
    }
}
