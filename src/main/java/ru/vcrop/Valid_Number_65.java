package ru.vcrop;

/*Runtime: 26 ms, faster than 5.26% of Java online submissions for Valid Number.
        Memory Usage: 47.4 MB, less than 5.01% of Java online submissions for Valid Number.*/
public class Valid_Number_65 {

    public boolean isNumber(String s) {
        return s.matches("(?i)[-+]?(\\d*\\.\\d+|\\d+\\.\\d*|\\d+)(e[-+]?\\d+)?");
    }
}
