package ru.vcrop;

/*Runtime: 8 ms, faster than 10.92% of Java online submissions for Divide Two Integers.
        Memory Usage: 41.8 MB, less than 22.85% of Java online submissions for Divide Two Integers.*/
public class Divide_Two_Integers_29 {

    private long[] sol(long dividend, long divisor, long sum) {
        if (dividend < divisor) return new long[]{dividend, 0};
        long[] ret = sol(dividend, divisor + divisor, sum + sum);
        if (ret[0] >= divisor) {
            ret[0] -= divisor;
            ret[1] += sum;
        }
        return ret;
    }

    public int divide(int dividend, int divisor) {
        boolean sign = dividend < 0 ^ divisor  < 0;

        long ldividend = dividend;
        long ldivisor = divisor;

        if (ldividend < 0) ldividend = -ldividend;
        if (ldivisor < 0) ldivisor = - ldivisor;

        long value = ldivisor + ldivisor;
        long sum = 2;
        long result = 0;

        while (ldividend >= value) {
            long[] ret = sol(ldividend, value, sum);
            ldividend = ret[0];
            result += ret[1];

            value += ldivisor;
            sum++;
        }

        System.out.println(result);

        if (result == 1L << 31 && !sign) return Integer.MAX_VALUE;

        result += ldividend >= ldivisor ? 1 : 0;

        return (int) (sign ? -result : result);
    }
}
