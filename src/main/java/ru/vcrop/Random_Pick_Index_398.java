package ru.vcrop;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*https://leetcode.com/problems/random-pick-index/
        Runtime: 66 ms, faster than 62.96% of Java online submissions for Random Pick Index.
        Memory Usage: 48.8 MB, less than 65.61% of Java online submissions for Random Pick Index.*/
public class Random_Pick_Index_398 {

    private final Map<Integer, List<Integer>> indexes;
    private final Random rndm;

    public Random_Pick_Index_398(int[] nums) {
        rndm = new Random();
        indexes = IntStream.range(0, nums.length).boxed().collect(Collectors.groupingBy(indx -> nums[indx]));
    }

    public int pick(int target) {
        List<Integer> res = indexes.get(target);
        return res.get(rndm.nextInt(res.size()));
    }
}
