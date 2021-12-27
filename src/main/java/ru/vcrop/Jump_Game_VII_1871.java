package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

/*https://leetcode.com/problems/jump-game-vii/
        Runtime: 23 ms, faster than 22.98% of Java online submissions for Jump Game VII.
        Memory Usage: 58.5 MB, less than 11.30% of Java online submissions for Jump Game VII.*/
public class Jump_Game_VII_1871 {

    public boolean canReach(String s, int minJump, int maxJump) {
        int count = 1;
        Deque<Integer> start = new LinkedList<>();
        Deque<Integer> end = new LinkedList<>();

        start.push(0);
        end.push(0);

        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' && i >= start.peekFirst()) {
                start.add(i + minJump);
                end.add(i + maxJump);
                if (i == s.length() - 1) return true;
            }
            if (end.peekFirst() == i) {
                start.pop();
                end.pop();
            }
            if (end.isEmpty()) return false;
        }
        return false;
    }

}
