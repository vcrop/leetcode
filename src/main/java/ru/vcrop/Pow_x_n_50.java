package ru.vcrop;

/*Runtime: 1 ms, faster than 77.09% of Java online submissions for Pow(x, n).
        Memory Usage: 43.2 MB, less than 38.43% of Java online submissions for Pow(x, n).*/
public class Pow_x_n_50 {

    private double solution(double x, long n) {
        if (n == 0) return 1.;
        if (n == 1) return x;
        if (n == 2) return x * x;
        double ret = solution(x, n / 2);
        return ((n % 2 == 1) ? x : 1) * ret * ret;
    }

    public double myPow(double x, int n) {
        return n < 0 ? 1 / solution(x, -(long) n) : solution(x, n);
    }
}
