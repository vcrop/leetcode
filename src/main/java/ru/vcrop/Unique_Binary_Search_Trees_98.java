package ru.vcrop;

/*https://leetcode.com/problems/unique-binary-search-trees/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Binary Search Trees.
        Memory Usage: 35.8 MB, less than 41.29% of Java online submissions for Unique Binary Search Trees.*/
public class Unique_Binary_Search_Trees_98 {

    public int numTrees(int n) {
        int[] array = new int[n + 1];
        array[0] = array[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i / 2; j++)
                array[i] += 2 * array[j] * array[i - j - 1];
            if (i % 2 == 1) array[i] += array[i / 2] * array[i / 2];
        }
        return array[n];
    }

}
