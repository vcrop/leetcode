package ru.vcrop;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*Runtime: 18 ms, faster than 46.66% of Java online submissions for Top K Frequent Elements.
        Memory Usage: 45 MB, less than 85.42% of Java online submissions for Top K Frequent Elements.*/
public class Top_K_Frequent_Elements_347 {

    public int[] topKFrequent(int[] nums, int k) {
        return IntStream.of(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
