package ru.vcrop;


import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/gray-code/
        Runtime: 4 ms, faster than 88.12% of Java online submissions for Gray Code.
        Memory Usage: 46.1 MB, less than 80.24% of Java online submissions for Gray Code.*/

public class Gray_Code_89 {

    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 0; i < n; i++) {
            int size = 1 << i;
            for (int j = 0; j < size; j++) result.add(size + result.get(size - j - 1));
        }
        return result;
    }

}
