package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/permutation-in-string/
Runtime: 15 ms, faster than 46.73% of Java online submissions for Permutation in String.
        Memory Usage: 41.9 MB, less than 37.77% of Java online submissions for Permutation in String.*/
public class Permutation_in_String_567 {

    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();
        for (char ch: s1.toCharArray())
            map.merge(ch, 1, Integer::sum);

        for (int i = 0; i < s2.length(); i++) {
            if (i >= s1.length()) {
                final char key = s2.charAt(i - s1.length());
                map.merge(key, 1, Integer::sum);
                if (map.get(key) == 0) map.remove(key);
                if (map.size() == 0) return true;
            }
            map.merge(s2.charAt(i), -1, Integer::sum);
            if (map.get(s2.charAt(i)) == 0) map.remove(s2.charAt(i));
            if (map.size() == 0) return true;
        }

        return false;
    }
}
