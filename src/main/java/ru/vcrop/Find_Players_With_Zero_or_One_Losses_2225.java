package ru.vcrop;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Runtime: 198 ms, faster than 47.96% of Java online submissions for Find Players With Zero or One Losses.
        Memory Usage: 92.3 MB, less than 91.97% of Java online submissions for Find Players With Zero or One Losses.*/
public class Find_Players_With_Zero_or_One_Losses_2225 {

    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Long> win = Stream.of(matches).collect(Collectors.groupingBy(i -> i[0], Collectors.counting()));
        Map<Integer,Long> lose = Stream.of(matches).collect(Collectors.groupingBy(i -> i[1], Collectors.counting()));

        List<Integer> l_win = win.keySet().stream().filter(i -> !lose.containsKey(i)).sorted().toList();
        List<Integer> l_lose = lose.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).sorted().toList();
        return List.of(l_win, l_lose);
    }
}
