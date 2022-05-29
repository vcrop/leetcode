package ru.vcrop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/*Runtime: 1444 ms, faster than 7.55% of Java online submissions for Maximum Product of Word Lengths.
        Memory Usage: 117.7 MB, less than 8.29% of Java online submissions for Maximum Product of Word Lengths.*/
public class Maximum_Product_of_Word_Lengths_318 {

    public int maxProduct(String[] words) {
        Map<Character, Set<String>> map = new HashMap<>();

        for (String word: words)
            for (char ch: word.toCharArray())
                map.computeIfAbsent(ch, k -> new HashSet<>()).add(word);

        int max = 0;

        Set<String> all = Set.of(words);

        for (String word: words) {

            Set<String> tmp = new HashSet<>(all);

            for (char ch: word.toCharArray())
                tmp.removeAll(map.get(ch));

            for (String other: tmp)
                max = Math.max(max, other.length() * word.length());
        }

        return max;
    }
}
