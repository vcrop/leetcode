package ru.vcrop;

/*https://leetcode.com/problems/add-digits/
Runtime: 1 ms, faster than 95.63% of Java online submissions for Add Digits.
        Memory Usage: 39.3 MB, less than 82.26% of Java online submissions for Add Digits.*/
public class Add_Digits_258 {

    public int addDigits(int num) {
        int res = 0;
        while (num != 0) {
            int add = res + (num % 10);
            res = add % 9 == 0 ? 9 : (add % 9);
            num /= 10;
        }
        return res;
    }
}
