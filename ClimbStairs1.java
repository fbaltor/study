import java.util.stream.*;

class Solution {
    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
            .reduce(1, (long x, long y) -> x * y);
    }

    public static long c(int x, int y) {
        long greater, minor;
        if (x > y) {
            greater = Long.valueOf(x);
            minor = Long.valueOf(y);
        } else {
            greater = Long.valueOf(y);
            minor = Long.valueOf(x);
        }

        long sum = greater + minor;

        long result = 1;
        for (long i = sum; i > greater; i--) {
            result = result * i;
        }

        long minorFactorial = factorialUsingStreams((int)minor);

        return result/minorFactorial;
    }

    public int climbStairs(int n) {
        int result = 0;

        for (int i = 0; 2*i <= n; i++) {
            result += c(i, n - 2*i);
        }

        return result;
    }
}