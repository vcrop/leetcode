package ru.vcrop;

/*https://leetcode.com/problems/palindrome-number/
Runtime: 7 ms, faster than 82.99% of Java online submissions for Palindrome Number.
        Memory Usage: 41.6 MB, less than 27.32% of Java online submissions for Palindrome Number.*/
public class Palindrome_Number_9 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int sign = (int) Math.log10(x);
        int power = (int) Math.pow(10, sign);
        for (int i = 1; i <= power; i *= 10, power /= 10)
            if ((x / power % 10) != (x / i % 10)) return false;
        return true;
    }
}
