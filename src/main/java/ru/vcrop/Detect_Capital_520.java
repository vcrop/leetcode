package ru.vcrop;

/*https://leetcode.com/problems/detect-capital/
        Runtime: 27 ms, faster than 5.09% of Java online submissions for Detect Capital.
        Memory Usage: 41 MB, less than 5.09% of Java online submissions for Detect Capital.*/
public class Detect_Capital_520 {

    public boolean detectCapitalUse(String word) {
        return word.matches("\\p{Lower}+|\\p{Upper}\\p{Lower}+|\\p{Upper}+");
    }
}
