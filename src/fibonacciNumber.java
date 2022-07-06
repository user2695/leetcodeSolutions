import java.util.HashMap;

public class fibonacciNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }

    static int fib(int N) {
        if (N <= 1) {
            return N;
        } // initialize our memoization map and put our base cases
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        map.put(1, 1);

        // call helper function
        return fib(N, map);
    }

    static int fib(int N, HashMap<Integer, Integer> map) {
        // have we already computed this sub-problem?
        // if not, then compute it and store it in our map
        if (!map.containsKey(N)) {
            int currentFib = fib(N - 1, map) + fib(N - 2, map);
            map.put(N, currentFib);
        }

        // since we have stored it already, simply return it
        return map.get(N);
    }
}
