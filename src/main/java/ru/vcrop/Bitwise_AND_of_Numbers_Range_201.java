package ru.vcrop;

/*Runtime: 8 ms, faster than 62.02% of Java online submissions for Bitwise AND of Numbers Range.
        Memory Usage: 44.4 MB, less than 33.62% of Java online submissions for Bitwise AND of Numbers Range.*/
public class Bitwise_AND_of_Numbers_Range_201 {

    public int rangeBitwiseAnd(int left, int right) {
        int diff = right - left;
        diff |= diff >>> 1;
        diff |= diff >>> 2;
        diff |= diff >>> 4;
        diff |= diff >>> 8;
        diff |= diff >>> 16;

        diff = ~diff;

        return left & right & diff;
    }
}
