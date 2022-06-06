import java.util.PriorityQueue;

public class lastStoneWeight {
    public static void main(String[] args) {
        int stones[] = { 2, 7, 4, 1, 8, 1 };
        System.out.println(lastStoneWeightt(stones));
    }

    static int lastStoneWeightt(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i : stones) {
            maxHeap.offer(i);
        }
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if (stone1 != stone2)
                maxHeap.add(stone1 - stone2);
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.remove();
    }
}
