import java.util.Arrays;

class findOriginalArrayFromDoubledArray {
    public static void main(String[] args) {
        int[] changed = { 1, 3, 4, 2, 6, 8 };
        int ans[] = findOriginalArray(changed);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    static int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);

        if (changed.length % 2 != 0)
            return new int[0];

        int mid = changed.length / 2;

        int[] res = new int[mid];

        int[] freq = new int[100001];

        for (int no : changed)
            freq[no]++;

        int idx = 0;

        for (int no : changed) {
            if (freq[no] > 0 && no * 2 <= 100000 && freq[no * 2] > 0) {
                freq[no]--;
                freq[no * 2]--;
                res[idx++] = no;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                return new int[0];
        }

        return res;
    }
}