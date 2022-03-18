package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

/*Runtime: 4 ms, faster than 75.34% of Java online submissions for Remove Duplicate Letters.
        Memory Usage: 42.9 MB, less than 41.51% of Java online submissions for Remove Duplicate Letters.*/
public class Remove_Duplicate_Letters_316 {

    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];

        for (char ch: s.toCharArray()) count[ch - 'a']++;

        Deque<Character> deque = new LinkedList<>();
        Deque<Character> tmp = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for (char ch: s.toCharArray())
            if (count[ch - 'a'] != 0) {
                count[ch - 'a']--;
                char c = 0;
                while (!deque.isEmpty() && (c = deque.getFirst()) < ch) tmp.push(deque.pop());
                if (c != ch && !deque.isEmpty())
                    while (!deque.isEmpty()) deque.pop();
                while (!tmp.isEmpty()) deque.push(tmp.pop());
                if (c != ch) deque.add(ch);

                if (count[ch - 'a'] == 0) {
                    while ((c = deque.pop()) != ch) {
                        count[c - 'a'] = 0;
                        sb.append(c);
                    };
                    sb.append(ch);
                }
            }

        return sb.toString();
    }
}
