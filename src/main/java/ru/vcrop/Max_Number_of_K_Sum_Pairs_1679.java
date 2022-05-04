package ru.vcrop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Runtime: 60 ms, faster than 28.82% of Java online submissions for Max Number of K-Sum Pairs.
        Memory Usage: 83.9 MB, less than 28.06% of Java online submissions for Max Number of K-Sum Pairs.*/
public class Max_Number_of_K_Sum_Pairs_1679 {

    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> visited = new HashMap<>();

        int ret = 0;

        for (int i: nums)
            if (visited.containsKey(k - i)) {
                visited.put(k - i, visited.get(k - i) - 1);
                if (visited.get(k - i) == 0) visited.remove(k - i);
                ret++;
            } else visited.put(i, visited.getOrDefault(i, 0) + 1);

        return ret;
    }

}
