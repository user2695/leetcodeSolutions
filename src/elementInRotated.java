public class elementInRotated {
    public static void main(String[] args) {
        int arr[]={4,5,3,4,5,6};
    
        
        System.out.println(elementRotated(arr));
    }
    static int elementRotated(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
