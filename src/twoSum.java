public class twoSum {
    public static void main(String[] args) {
    int arr[]={1,3,7,9,2};
    int k= 11;
    int ans[]=new int[2];
    ans=sum(arr,k);
    for(int i=0;i<ans.length;i++)
    System.out.println(ans[i]);    
    }
    static int[] sum(int nums[],int k){
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==k){                   
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }

}
