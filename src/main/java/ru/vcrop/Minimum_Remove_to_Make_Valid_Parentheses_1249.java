package ru.vcrop;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
        Runtime: 17 ms, faster than 64.73% of Java online submissions for Minimum Remove to Make Valid Parentheses.
        Memory Usage: 39.7 MB, less than 66.91% of Java online submissions for Minimum Remove to Make Valid Parentheses.*/
public class Minimum_Remove_to_Make_Valid_Parentheses_1249 {

    public String minRemoveToMakeValid(String s) {
        Deque<Integer> deque = new LinkedList<>();
        Set<Integer> removal = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') deque.push(i);
            if (s.charAt(i) == ')')
                if (deque.isEmpty()) removal.add(i);
                else deque.pop();
        }
        removal.addAll(deque);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
            if (!removal.contains(i)) sb.append(s.charAt(i));

        return sb.toString();
    }
}
