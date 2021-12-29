package ru.vcrop;

/*https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
Runtime: 13 ms, faster than 97.20% of Java online submissions for Minimum Number of Swaps to Make the String Balanced.
        Memory Usage: 47 MB, less than 98.40% of Java online submissions for Minimum Number of Swaps to Make the String Balanced.*/
public class Minimum_Number_of_Swaps_to_Make_the_String_Balanced_1963 {

    public int minSwaps(String s) {
        int res = 0;
        int sum = 0;
        for (char c: s.toCharArray())
            if (sum == 0 && c == ']') res++;
            else sum += c == '[' ? 1 : -1;

        return (res + 1) / 2;
    }

}
