package ru.vcrop;

/*https://leetcode.com/problems/duplicate-zeros/
        Runtime: 1 ms, faster than 88.95% of Java online submissions for Duplicate Zeros.
        Memory Usage: 39 MB, less than 81.37% of Java online submissions for Duplicate Zeros.*/
public class Duplicate_Zeros_1089 {

    public void duplicateZeros(int[] arr) {
        int zeros_count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) zeros_count++;

        for (int i = arr.length - 1 + zeros_count; i > -1; i--) {
            if (arr[i - zeros_count] == 0) {
                if (i < arr.length) arr[i] = 0;
                if (i - 1 < arr.length) arr[i - 1] = 0;
                i--;
                zeros_count--;
            } else if (i < arr.length) arr[i] = arr[i - zeros_count];
        }

    }

}
