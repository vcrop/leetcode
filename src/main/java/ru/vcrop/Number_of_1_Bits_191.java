package ru.vcrop;

/*Runtime: 1 ms, faster than 81.34% of Java online submissions for Number of 1 Bits.
        Memory Usage: 41.5 MB, less than 27.94% of Java online submissions for Number of 1 Bits.*/
public class Number_of_1_Bits_191 {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        };
        return count;
    }
}
