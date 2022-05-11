package ru.vcrop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Runtime: 9 ms, faster than 21.59% of Java online submissions for Permutation Sequence.
        Memory Usage: 42 MB, less than 32.77% of Java online submissions for Permutation Sequence.*/
public class Permutation_Sequence_60 {

    public String getPermutation(int n, int k) {
        k--;
        List<Integer> numbers = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
        List<Integer> factorials = Stream.iterate(new int[]{1, 1}, i -> new int[]{i[0] * i[1], i[1] + 1})
                .limit(n)
                .map(i -> i[0]).toList();

        StringBuilder result = new StringBuilder();

        for (int i = factorials.size() - 1; i > -1; i--) {
            int pos = k / factorials.get(i);
            k = k % factorials.get(i);
            result.append(numbers.get(pos));
            numbers.remove(pos);
        }

        return result.toString();
    }

}
