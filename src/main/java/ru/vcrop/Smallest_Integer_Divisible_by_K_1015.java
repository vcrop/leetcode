package ru.vcrop;

/*https://leetcode.com/problems/smallest-integer-divisible-by-k/
        Runtime: 2 ms, faster than 80.88% of Java online submissions for Smallest Integer Divisible by K.
        Memory Usage: 38.1 MB, less than 20.59% of Java online submissions for Smallest Integer Divisible by K.*/
public class Smallest_Integer_Divisible_by_K_1015 {

    public int smallestRepunitDivByK(int k) {
        boolean[] rest = new boolean[k];
        int number = 1 % k;
        int n = 1;
        for (;; number = (number * 10 + 1) % k, n++)
            if (number == 0) return n;
            else if (rest[number]) return -1;
            else rest[number] = true;

    }
}
