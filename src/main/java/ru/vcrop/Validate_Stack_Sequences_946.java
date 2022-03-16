package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

/*Runtime: 2 ms, faster than 89.31% of Java online submissions for Validate Stack Sequences.
        Memory Usage: 45.7 MB, less than 13.33% of Java online submissions for Validate Stack Sequences.*/
public class Validate_Stack_Sequences_946 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> deque = new LinkedList<>();
        int pointer = 0;
        for (int p: pushed) {
            deque.push(p);
            while (pointer < popped.length && !deque.isEmpty() && deque.getFirst() == popped[pointer]) {
                deque.pop();
                pointer++;
            }
        }
        while (pointer < popped.length && !deque.isEmpty() && deque.getFirst() == popped[pointer]) {
            deque.pop();
            pointer++;
        };
        return pointer == popped.length && deque.isEmpty();
    }
}
