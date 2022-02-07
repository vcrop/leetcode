package ru.vcrop;

/*https://leetcode.com/problems/find-the-difference/
Runtime: 1 ms, faster than 99.79% of Java online submissions for Find the Difference.
        Memory Usage: 42.2 MB, less than 12.12% of Java online submissions for Find the Difference.*/
public class Find_the_Difference_389 {

    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for (char ch: s.toCharArray())
            chars[ch - 'a']++;
        for (char ch: t.toCharArray()) {
            chars[ch - 'a']--;
            if (chars[ch - 'a'] < 0) return ch;
        }
        return 0;
    }
}
