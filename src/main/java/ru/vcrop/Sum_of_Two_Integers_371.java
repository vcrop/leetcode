package ru.vcrop;

/*https://leetcode.com/problems/sum-of-two-integers/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Two Integers.
        Memory Usage: 35.6 MB, less than 85.37% of Java online submissions for Sum of Two Integers.*/
public class Sum_of_Two_Integers_371 {

    public int getSum(int a, int b) {
        int additional = 0;
        int c = 0;
        for (int i = 0; i < 32; i++) {
            int tmp = ((a & 1) & (b & 1)) | ((a & 1) & additional) | ((b & 1) & additional);
            c |= ((a & 1) ^ (b & 1) ^ additional) << i;
            a >>>= 1;
            b >>>= 1;
            additional = tmp;
        }
        return c;
    }

}
