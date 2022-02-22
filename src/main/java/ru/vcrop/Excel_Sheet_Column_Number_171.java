package ru.vcrop;

/*https://leetcode.com/problems/excel-sheet-column-number/
Runtime: 6 ms, faster than 6.06% of Java online submissions for Excel Sheet Column Number.
        Memory Usage: 43.3 MB, less than 6.25% of Java online submissions for Excel Sheet Column Number.*/
public class Excel_Sheet_Column_Number_171 {
    public int titleToNumber(String columnTitle) {
        return columnTitle.chars().map(ch -> ch - '@').reduce(0, (a, b) -> a * 26 + b);
    }
}
