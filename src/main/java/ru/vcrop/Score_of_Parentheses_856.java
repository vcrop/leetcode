package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Score of Parentheses.
        Memory Usage: 39.8 MB, less than 80.24% of Java online submissions for Score of Parentheses.*/
public class Score_of_Parentheses_856 {

    public int scoreOfParentheses(String s) {
        Deque<Integer> deque = new LinkedList<>();
        for (char ch: s.toCharArray())
            if (ch == '(') deque.push(0);
            else {
                int sum = 0;
                for (int i = deque.pop(); i != 0; i = deque.pop()) sum += i;
                deque.push(sum == 0 ? 1 : sum * 2);
            }
        int sum = 0;
        while (!deque.isEmpty()) sum += deque.pop();
        return sum;
    }
}
