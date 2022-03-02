package ru.vcrop;

public class Counting_Bits_338 {

    public int[] countBits(int n) {
        if (n == 0) return new int[]{0};
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++)
            result[i] = result[i / 2] + (i % 2);
        return result;
    }
}
