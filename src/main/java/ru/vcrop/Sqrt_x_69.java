package ru.vcrop;
/*
Runtime: 1 ms, faster than 99.73% of Java online submissions for Sqrt(x).
        Memory Usage: 39.1 MB, less than 99.68% of Java online submissions for Sqrt(x).*/
public class Sqrt_x_69 {

    public int mySqrt(int x) {
        long low = 0;
        long hi = x;

        while (low < hi) {
            long middle = low + (hi - low) / 2;
            long ret = middle * middle;
            long ret1 = (middle + 1) * (middle + 1);
            if (ret <= x && ret1 > x) return (int) middle;
            if (ret < x) low = middle + 1;
            else hi = middle - 1;
        }

        return (int) low;
    }
}
