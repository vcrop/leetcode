package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/generate-parentheses/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Generate Parentheses.
        Memory Usage: 40.4 MB, less than 12.41% of Java online submissions for Generate Parentheses.*/
public class Generate_Parentheses_22 {

    private List<String> solution(int open_count, int pos, int limit, List<String> parenthesis, StringBuilder res) {
        if (pos == limit) {
            parenthesis.add(res.toString());
            return parenthesis;
        }
        if (pos / 2 >= open_count) {
            res.setCharAt(pos, '(');
            return solution(open_count + 1, pos + 1, limit, parenthesis, res);
        }
        if (open_count == limit / 2) {
            res.setCharAt(pos, ')');
            return solution(open_count, pos + 1, limit, parenthesis, res);
        }
        res.setCharAt(pos, '(');
        solution(open_count + 1, pos + 1, limit, parenthesis, res);
        res.setCharAt(pos, ')');
        solution(open_count, pos + 1, limit, parenthesis, res);
        return parenthesis;
    }
    public List<String> generateParenthesis(int n) {
        return solution(0, 0, n * 2, new ArrayList<>(), new StringBuilder().append(new char[n * 2]));
    }
}
