package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/circular-permutation-in-binary-representation/
        Runtime: 5 ms, faster than 73.33% of Java online submissions for Circular Permutation in Binary Representation.
        Memory Usage: 46.6 MB, less than 87.78% of Java online submissions for Circular Permutation in Binary Representation.*/
public class Circular_Permutation_in_Binary_Representation_1238 {

    public List<Integer> circularPermutation(int n, int start) {
        int[] arr = new int[1 << n];

        int pos = 0;
        int curr = 0;

        for (int i = 0; i < arr.length; i++)
            if ((arr[i] = (curr ^= (i & -i))) == start) pos = i;

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            res.add(arr[(i + pos) % arr.length]);

        return res;
    }
}
