package ru.vcrop;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Runtime: 42 ms, faster than 22.76% of Java online submissions for Network Delay Time.
        Memory Usage: 71.7 MB, less than 5.09% of Java online submissions for Network Delay Time.*/
import static java.util.stream.Collectors.groupingBy;

public class Network_Delay_Time_734 {

    public int networkDelayTime(int[][] times, int n, int k) {

        int ret = 0;

        Map<Integer, List<int[]>> paths = Stream.of(times).collect(groupingBy(i -> i[0]));

        Map<Integer, Integer> visited = new HashMap<>();

        List<Integer> ready = new ArrayList<>();

        ready.add(k);
        visited.put(k, 0);

        while (!ready.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i : ready)
                if (paths.containsKey(i))
                    for (int[] ii : paths.get(i)) {
                        int time = visited.getOrDefault(ii[1], Integer.MAX_VALUE);
                        if (visited.get(i) + ii[2] < time) {
                            visited.put(ii[1], visited.get(i) + ii[2]);
                            tmp.add(ii[1]);
                        }
                    }
            ready = tmp;

        }

        if (visited.size() != n) return -1;

        return visited.values().stream().max(Comparator.naturalOrder()).orElse(-1);
    }

}
