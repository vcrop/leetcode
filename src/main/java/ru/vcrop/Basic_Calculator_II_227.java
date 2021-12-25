package ru.vcrop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.IntBinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*https://leetcode.com/problems/basic-calculator-ii/
        Runtime: 62 ms, faster than 5.00% of Java online submissions for Basic Calculator II.
        Memory Usage: 52.2 MB, less than 5.01% of Java online submissions for Basic Calculator II.*/
public class Basic_Calculator_II_227 {

    public int calculate(String s) {
        Map<String, IntBinaryOperator> ops = Map.of(
                "+", Integer::sum,
                "-", (a, b) -> a - b,
                "*", (a, b) -> a * b,
                "/", (a, b) -> a / b
        );

        Matcher matcher = Pattern.compile("\\s*(\\d+)\\s*([-+*/])?").matcher(s);

        int count = 0;

        List<int[]> elems = new ArrayList<>();
        List<Object[]> operators = new ArrayList<>();
        List<Object[]> low_priority = new ArrayList<>();

        while (matcher.find()) {
            elems.add(new int[]{Integer.parseInt(matcher.group(1)), count, count});
            if (matcher.group(2) != null)
                if (matcher.group(2).equals("*") || matcher.group(2).equals("/"))
                    operators.add(new Object[]{ops.get(matcher.group(2)), count, count + 1});
                else low_priority.add(new Object[]{ops.get(matcher.group(2)), count, count + 1});
            count++;
        }

        operators.addAll(low_priority);

        if (operators.isEmpty()) return elems.get(0)[0];

        int result = 0;

        for (Object[] o: operators) {
            int left = (int) o[1];
            int right = (int) o[2];
            int res = ((IntBinaryOperator) o[0]).applyAsInt(elems.get(left)[0], elems.get(right)[0]);

            int[] left_elem = elems.get(elems.get(left)[1]);
            int[] right_elem = elems.get(elems.get(right)[2]);

            left_elem[0] = res;
            left_elem[2] =right_elem[2];

            right_elem[0] = res;
            right_elem[1] = left_elem[1];

            result = res;
        }

        return result;

    }
}
