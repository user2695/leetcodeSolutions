import java.util.HashMap;

public class sumUniqueElements {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1, 1 };
        System.out.print(sumOfUnique(nums));
    }

    static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : nums) {
            if (hm.containsKey(val))
                hm.put(val, (hm.get(val) + 1));
            else
                hm.put(val, 1);
        }

        int sum = 0;
        for (Integer key : hm.keySet()) {
            if (hm.get(key) == 1)
                sum += key;
        }

        return sum;
    }
}