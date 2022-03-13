package ru.vcrop;


import java.util.Deque;
import java.util.LinkedList;

/*Runtime: 14 ms, faster than 78.53% of Java online submissions for Check If Word Is Valid After Substitutions.
        Memory Usage: 47.9 MB, less than 11.87% of Java online submissions for Check If Word Is Valid After Substitutions.*/
public class Check_If_Word_Is_Valid_After_Substitutions_1003 {

    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch: s.toCharArray()) {
            if (ch == 'c') {
                if (deque.size() < 2) return false;
                else if (deque.pop() != 'b' || deque.pop() != 'a') return false;
            } else deque.push(ch);
        }
        return deque.isEmpty();
    }
}
