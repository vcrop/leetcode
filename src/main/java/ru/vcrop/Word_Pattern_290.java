package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/word-pattern/
        Runtime: 1 ms, faster than 86.67% of Java online submissions for Word Pattern.
        Memory Usage: 36.8 MB, less than 80.77% of Java online submissions for Word Pattern.*/
public class Word_Pattern_290 {
    public boolean wordPattern(String pattern, String s) {
        String[] p = s.split(" ");
        if (p.length != pattern.length()) return false;
        Map<Character,String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++)
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(p[i])) return false;
            } else if (map.containsValue(p[i])) return false;
            else map.put(pattern.charAt(i), p[i]);
        return true;
    }

}
