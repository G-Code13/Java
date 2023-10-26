import java.util.HashMap;

public class Fibonacci {

    static int fibonacci(int n) {
        return fibonacci(n, new HashMap<>());
    };

    static int fibonacci(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        memo.put(n, result);
        return result;
    };
};
