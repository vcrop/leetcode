package ru.vcrop;

import java.util.HashSet;
import java.util.Set;

/*Runtime: 48 ms, faster than 88.02% of Java online submissions for Check If a String Contains All Binary Codes of Size K.
        Memory Usage: 48.3 MB, less than 94.27% of Java online submissions for Check If a String Contains All Binary Codes of Size K.*/
public class CheckIfaStringContainsAllBinaryCodesofSizeK_1461 {

    public boolean hasAllCodes(String s, int k) {
        if (s.length() < 1 << k) return false;
        int val = Integer.parseInt(s.substring(0, k), 2);
        int mask = (1 << k) - 1;

        Set<Integer> set = new HashSet<>();
        set.add(val);

        for (int i = k; i < s.length(); i++)
           set.add(val = (((val << 1) & mask) + (s.charAt(i) - '0')));

        return set.size() == 1 << k;
    }

}
