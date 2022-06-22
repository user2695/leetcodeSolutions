
public class findPivotIndex {
    public static void main(String[] args) {
        int[] nums = { 1,7,3,6,5,6 };
        System.out.println(pivotIndex(nums));
    }

    static int pivotIndex(int[] nums) {
        {
            if(nums.length<1)
                return -1;
            int rsum=0, lsum=0;
            for(int x:nums)    //calculating sum of the array
                rsum+=x;
            for(int x=0; x<nums.length; x++)
            {
                rsum-=nums[x];
                if(rsum==lsum)
                    return x;
                lsum+=nums[x];
            }
            return -1;
        } 
    }
}
