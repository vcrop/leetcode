package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*Runtime: 4 ms, faster than 60.45% of Java online submissions for Triangle.
        Memory Usage: 41.9 MB, less than 87.78% of Java online submissions for Triangle.*/
public class Triangle_120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> last_row = new ArrayList<>();
        for (int i = 0; i <= triangle.get(triangle.size() - 1).size(); i++) last_row.add(0);

        for (int i = triangle.size() - 1; i > -1; i--)
            for (int j = 0; j < triangle.get(i).size(); j++)
                last_row.set(j, Math.min(last_row.get(j), last_row.get(j + 1)) + triangle.get(i).get(j));

        return last_row.get(0);
    }
}
