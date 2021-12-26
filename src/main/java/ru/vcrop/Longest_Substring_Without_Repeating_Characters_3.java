package ru.vcrop;


import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/longest-substring-without-repeating-characters/
        Runtime: 6 ms, faster than 63.24% of Java online submissions for Longest Substring Without Repeating Characters.
        Memory Usage: 38.9 MB, less than 91.11% of Java online submissions for Longest Substring Without Repeating Characters.*/
public class Longest_Substring_Without_Repeating_Characters_3 {

    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) start = Math.max(start, map.get(s.charAt(i)));
            map.put(s.charAt(i), i);
            max = Math.max(i - start, max);
        }
        return max;
    }

}
