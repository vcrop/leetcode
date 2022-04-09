package ru.vcrop;

import java.util.List;

/*Runtime: 27 ms, faster than 9.88% of Java online submissions for Integer to Roman.
        Memory Usage: 46.6 MB, less than 25.89% of Java online submissions for Integer to Roman.*/
public class Integer_to_Roman_12 {

    public String intToRoman(int num) {
        return List.of("", "M", "MM", "MMM").get(num / 1000) +
                List.of("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM").get(num / 100 % 10) +
                List.of("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC").get(num / 10 % 10) +
                List.of("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX").get(num % 10);
    }
}
