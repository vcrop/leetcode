package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
        Memory Usage: 40.3 MB, less than 77.26% of Java online submissions for Fibonacci Number.*/
public class Fibonacci_Number_509 {

    public int fib(int n) {
        int[] f = new int[2];
        f[1] = 1;
        if (n < 2) return f[n];
        for (int i = 2; i <= n; i++) {
            f[1] = f[0] + (f[0] = f[1]);
        }
        return f[1];
    }
}
