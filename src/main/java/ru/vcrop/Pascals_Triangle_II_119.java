package ru.vcrop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*Runtime: 1 ms, faster than 88.64% of Java online submissions for Pascal's Triangle II.
        Memory Usage: 39.6 MB, less than 98.44% of Java online submissions for Pascal's Triangle II.*/
public class Pascals_Triangle_II_119 {

    public List<Integer> getRow(int rowIndex) {
        int[] result = new int[rowIndex + 1];
        result[0] = 1;


        for (int i = 1; i <= rowIndex; i++)
            for (int j = i; j > -1; j--)
                result[j] = j == 0 || j == i ? 1 : (result[j - 1] + result[j]);

        return IntStream.of(result).boxed().collect(Collectors.toList());
    }
}
