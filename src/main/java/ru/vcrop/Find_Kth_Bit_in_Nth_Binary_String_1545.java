package ru.vcrop;

/*https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Kth Bit in Nth Binary String.
        Memory Usage: 35.8 MB, less than 99.39% of Java online submissions for Find Kth Bit in Nth Binary String.*/
public class Find_Kth_Bit_in_Nth_Binary_String_1545 {

    private int implementation(int n, int k) {
        if (n == 1) return 0;
        int size = (1 << n) - 1;
        if (k == size / 2) return 1;
        if (k < size / 2) return implementation(n - 1, k);
        return 1 - implementation(n - 1, size - k - 1);
    }

    public char findKthBit(int n, int k) {
        return (char) ('0' + implementation(n, k - 1));
    }

}
