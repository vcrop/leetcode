package ru.vcrop;

import java.util.ArrayDeque;
import java.util.Deque;

/*Runtime: 12 ms, faster than 92.55% of Java online submissions for Remove All Adjacent Duplicates in String II.
        Memory Usage: 43.9 MB, less than 78.29% of Java online submissions for Remove All Adjacent Duplicates in String II.*/
public class Remove_All_Adjacent_Duplicates_in_StringII_1209 {

    public String removeDuplicates(String s, int k) {
        Deque<int[]> deque = new ArrayDeque<>();

        for (char ch : s.toCharArray())
            if (deque.isEmpty() || deque.peekFirst()[0] != ch)
                deque.push(new int[]{ch, 1});
            else if (deque.peekFirst()[1] == k - 1) {
                deque.pop();
            } else deque.peekFirst()[1]++;

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {
            int[] in = deque.removeLast();
            sb.append(String.valueOf((char) in[0]).repeat(Math.max(0, in[1])));
        }

        return sb.toString();

    }
}
