package ru.vcrop;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*Runtime: 940 ms, faster than 16.31% of Java online submissions for Word Ladder.
        Memory Usage: 54.5 MB, less than 56.42% of Java online submissions for Word Ladder.*/
public class Word_Ladder_127 {
    private Map<Integer, Set<Integer>> tree(List<String> wordList) {
        Map<Integer, Set<Integer>> ret = new HashMap<>();
        for (int i = 0; i < wordList.size() - 1; i++)
            for (int j = i + 1; j < wordList.size(); j++) {
                String first = wordList.get(i);
                String second = wordList.get(j);
                if (first.length() == second.length()) {
                    int diff = 0;
                    for (int ch = 0; ch < first.length() && diff < 2; ch++)
                        if (first.charAt(ch) != second.charAt(ch)) diff++;
                    if (diff == 1) {
                        ret.computeIfAbsent(i, k -> new HashSet<>()).add(j);
                        ret.computeIfAbsent(j, k -> new HashSet<>()).add(i);
                    }
                }
            }
        return ret;
    }

    private int walk(Map<Integer, Set<Integer>> map, int to, int size) {
        Set<Integer> can_visit = IntStream.range(0, size).boxed().collect(Collectors.toSet());

        int ret = 0;
        List<Integer> current = List.of(0);

        while (!current.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int c : current) {
                if (c == to) return ret;
                if (can_visit.remove(c))
                    if (map.containsKey(c))
                        tmp.addAll(map.get(c));
            }
            current = tmp;
            ret++;
        }

        return -1;
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int index = wordList.indexOf(endWord) + 1;
        if (index == 0) return 0;

        return walk(tree(new ArrayList<>(wordList) {{
            add(0, beginWord);
        }}), index, wordList.size() + 1) + 1;
    }

}
