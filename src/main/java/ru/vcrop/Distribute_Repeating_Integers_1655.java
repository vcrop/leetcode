package ru.vcrop;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Distribute_Repeating_Integers_1655 {

    private boolean backtracking(int[] freq, int pf, int[] quantity, int pq) {
        if (pq == quantity.length) return true;
        if (pf == freq.length) return false;

        for (int i = freq.length - 1; i > -1; i--)
            if (freq[i] >= quantity[pq]) {
                freq[i] -= quantity[pq];
                if (backtracking(freq, i, quantity, pq + 1)) return true;
                freq[i] += quantity[pq];
            } else return false;

        return false;
    }

    public boolean canDistribute(int[] nums, int[] quantity) {
        int[] freq = IntStream.of(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i -> 1)))
                .values()
                .stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.sort(quantity);


        return backtracking(freq, 0, quantity, 0);
    }

    public static void main(String[] args) {
        System.out.println(
                new Distribute_Repeating_Integers_1655().canDistribute(new int[]{2, 2, 1, 1, 2}, new int[]{2, 2, 1})
        );
    }

}
