package ru.vcrop;

/*https://leetcode.com/problems/number-complement/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Number Complement.
        Memory Usage: 35.5 MB, less than 91.94% of Java online submissions for Number Complement.*/
public class Number_Complement_476 {

    public int findComplement(int num) {
        return Integer.highestOneBit(num) - 1 & ~num;
    }
}
