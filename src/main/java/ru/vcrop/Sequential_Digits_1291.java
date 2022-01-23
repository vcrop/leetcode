package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/sequential-digits/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Sequential Digits.
        Memory Usage: 38.3 MB, less than 22.83% of Java online submissions for Sequential Digits.*/
public class Sequential_Digits_1291 {

    public List<Integer> sequentialDigits(int low, int high) {
        int sum = 1;
        int init = 1;
        int limit = 10;
        int k = 9;

        List<Integer> result = new ArrayList<>();

        for (;init < 1e9; sum = sum * 10 + 1, init += sum, limit *= 10, k--) {
            for (int i = init, j = 0; i < limit && j < k; i += sum, j++)
                if (i > high) return result;
                else if (i >= low) result.add(i);

        }

        return result;

    }
}
