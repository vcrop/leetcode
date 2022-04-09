package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.IntBinaryOperator;

/*Runtime: 5 ms, faster than 91.35% of Java online submissions for Evaluate Reverse Polish Notation.
        Memory Usage: 42 MB, less than 87.32% of Java online submissions for Evaluate Reverse Polish Notation.*/
public class Evaluate_Reverse_Polish_Notation_150 {

    public int evalRPN(String[] tokens) {
        Map<String, IntBinaryOperator> map = Map.of(
                "+", Integer::sum,
                "-", (a, b) -> b - a,
                "*", (a, b) -> a * b,
                "/", (a, b) -> b / a
        );

        Deque<Integer> deque = new LinkedList<>();

        for (String token : tokens)
            if (map.containsKey(token))
                deque.push(map.get(token).applyAsInt(deque.pop(), deque.pop()));
            else
                deque.push(Integer.parseInt(token));

        return deque.pop();
    }

}
