package ru.vcrop;

/*https://leetcode.com/problems/power-of-two/
        Runtime: 1 ms, faster than 99.97% of Java online submissions for Power of Two.
        Memory Usage: 36.3 MB, less than 40.36% of Java online submissions for Power of Two.*/
public class Power_of_Two_231 {

    public boolean isPowerOfTwo(int n) {
        if (n == Integer.MIN_VALUE) return false;
        return n != 0 && (n ^ (n & -n)) == 0;
    }

}
