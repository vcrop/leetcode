package ru.vcrop;

import java.util.stream.IntStream;

/*https://leetcode.com/problems/intersection-of-two-arrays-ii/
        Runtime: 3 ms, faster than 43.32% of Java online submissions for Intersection of Two Arrays II.
        Memory Usage: 39.3 MB, less than 47.30% of Java online submissions for Intersection of Two Arrays II.*/
public class Intersection_of_Two_Arrays_II_350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] elems = new int[1001];
        for (int i: nums1) elems[i]++;
        return IntStream.of(nums2).filter(i -> (elems[i] -= 1) > -1).toArray();
    }
}
