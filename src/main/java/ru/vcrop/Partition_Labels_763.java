package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*Runtime: 4 ms, faster than 83.19% of Java online submissions for Partition Labels.
        Memory Usage: 42.6 MB, less than 62.77% of Java online submissions for Partition Labels.*/
public class Partition_Labels_763 {

    public List<Integer> partitionLabels(String s) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            chars[val] = Math.max(chars[val], i);
        };


        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int  j = i;
            int count = 0;
            while (j <= i) {
                i = Math.max(chars[s.charAt(j) - 'a'], i);
                j++;
                count++;
            }
            result.add(count);
        }

        return result;
    }
}
