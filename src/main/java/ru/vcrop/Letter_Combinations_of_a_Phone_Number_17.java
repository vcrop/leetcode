package ru.vcrop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*Runtime: 4 ms, faster than 45.19% of Java online submissions for Letter Combinations of a Phone Number.
        Memory Usage: 42.2 MB, less than 73.27% of Java online submissions for Letter Combinations of a Phone Number.*/
public class Letter_Combinations_of_a_Phone_Number_17 {

    Map<String,String[]> map = new HashMap<>(){
        {
            put("2", "abc".split(""));
            put("3", "def".split(""));
            put("4", "ghi".split(""));
            put("5", "jkl".split(""));
            put("6", "mno".split(""));
            put("7", "pqrs".split(""));
            put("8", "tuv".split(""));
            put("9", "wxyz".split(""));
        }
    };

    private List<String> impl(String digits, int n) {
        if (n == digits.length() - 1) return List.of(map.get(digits.split("")[n]));
        List<String> res = new ArrayList<>();
        for (String s1: impl(digits, n + 1))
            for (String s: map.get(digits.split("")[n]))
                res.add(s + s1);
        return res;
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return List.of();
        return impl(digits, 0);
    }
}
