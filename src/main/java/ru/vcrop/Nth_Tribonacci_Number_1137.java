package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for N-th Tribonacci Number.
        Memory Usage: 41.2 MB, less than 28.38% of Java online submissions for N-th Tribonacci Number.*/
public class Nth_Tribonacci_Number_1137 {
    public int tribonacci(int n) {
        int[] t = new int[3];
        t[1] = t[2] = 1;
        if (n < 3) return t[n];
        for (int i = 3; i <= n; i++)
            t[2] = t[0] + (t[0] = t[1]) + (t[1] = t[2]);
        return t[2];
    }
}
