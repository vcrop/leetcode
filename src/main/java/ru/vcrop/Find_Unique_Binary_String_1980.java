package ru.vcrop;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Runtime: 7 ms, faster than 31.19% of Java online submissions for Find Unique Binary String.
        Memory Usage: 42.3 MB, less than 49.48% of Java online submissions for Find Unique Binary String.*/
public class Find_Unique_Binary_String_1980 {

    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> integers = Stream.of(nums).map(n -> Integer.parseInt(n, 2)).collect(Collectors.toSet());
        for (int i = 0; i < nums.length + 1; i++)
            if (!integers.contains(i)) {
                String ret = Integer.toString(i, 2);
                return "0".repeat(nums.length - ret.length()) + ret;
            }
        return null;
    }
}
