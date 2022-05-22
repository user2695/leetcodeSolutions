import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(search(arr, target));
    }

    // static int search(int[] nums, int target) {
    // int l = 0, r = nums.length - 1;
    // int mid;
    // while (l <= r) {
    // mid = l + (r - l) / 2;
    // if (nums[mid] == target) {
    // return mid;
    // } else if (target < mid) {
    // r = mid - 1;
    // } else if (target > mid) {
    // l = mid + 1;
    // }
    // }
    // return -1;
    // }
    static int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return (index < 0) ? -1 : index;
    }

}