package ru.vcrop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*https://leetcode.com/problems/find-all-anagrams-in-a-string/
Runtime: 47 ms, faster than 30.00% of Java online submissions for Find All Anagrams in a String.
        Memory Usage: 51.8 MB, less than 11.50% of Java online submissions for Find All Anagrams in a String.*/
public class Find_All_Anagrams_in_a_String_438 {

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) return List.of();
        List<Integer> result = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for (char ch: p.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (int i = 0; i < p.length(); i++)
            if (map.merge(s.charAt(i), -1, (a, b) -> a - 1) == 0)
                map.remove(s.charAt(i));

        if (map.size() == 0) result.add(0);

        for (int i = p.length(); i < s.length(); i++) {
            if (map.merge(s.charAt(i - p.length()), 1, (a, b) -> a + 1) == 0)
                map.remove(s.charAt(i - p.length()));
            if (map.merge(s.charAt(i), -1, (a, b) -> a - 1) == 0)
                map.remove(s.charAt(i ));
            if (map.size() == 0) result.add(i - p.length() + 1);
        };
        return result;
    }
}
