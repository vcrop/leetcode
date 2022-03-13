package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

/*Runtime: 2 ms, faster than 81.09% of Java online submissions for Valid Parentheses.
        Memory Usage: 42 MB, less than 36.84% of Java online submissions for Valid Parentheses.*/
public class Valid_Parentheses_20 {
    public boolean isValid(String s) {
        Deque<Character> chars = new LinkedList<>();
        for (char ch: s.toCharArray())
            if (ch == '(' || ch == '{' || ch == '[')
                chars.push(ch);
            else {
                if (chars.isEmpty()) return false;
                char tmp = chars.pop();
                if ((tmp == '(' && ch == ')') || (tmp == '{' && ch == '}') || (tmp == '[' && ch == ']'));
                else return false;
            }
        return chars.isEmpty();
    }
}
