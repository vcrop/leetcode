package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*Runtime: 23 ms, faster than 47.33% of Java online submissions for Maximum Split of Positive Even Integers.
        Memory Usage: 119.4 MB, less than 49.36% of Java online submissions for Maximum Split of Positive Even Integers.*/
public class Maximum_Split_of_Positive_Even_Integers_2178 {

    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 == 1) return List.of();

        List<Long> ret = new ArrayList<>();

        long i = 2;

        for (; i <= finalSum; finalSum -= i, i += 2) ret.add(i);

        if (finalSum == 0) return ret;

        ret.remove(i - finalSum);

        ret.add(i);

        return ret;
    }
}
