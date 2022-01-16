package ru.vcrop;

import java.util.stream.IntStream;

/*https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
        Runtime: 34 ms, faster than 5.34% of Java online submissions for Find the Distance Value Between Two Arrays.
        Memory Usage: 44.9 MB, less than 6.49% of Java online submissions for Find the Distance Value Between Two Arrays.*/
public class Find_the_Distance_Value_Between_Two_Arrays_1385 {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        return (int) IntStream.of(arr1).filter(i -> IntStream.of(arr2).noneMatch(j -> Math.abs(i - j) <= d)).count();
    }
}
