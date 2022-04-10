package ru.vcrop;

import java.util.LinkedList;

/*Runtime: 3 ms, faster than 78.45% of Java online submissions for Baseball Game.
        Memory Usage: 41.8 MB, less than 77.59% of Java online submissions for Baseball Game.*/

public class Baseball_Game_682 {

    public int calPoints(String[] ops) {
        LinkedList<Integer> deque = new LinkedList<>();

        for (String op : ops)
            switch (op) {
                case "C":
                    deque.pop();
                    break;
                case "D":
                    deque.push(deque.getFirst() * 2);
                    break;
                case "+":
                    deque.push(deque.getFirst() + deque.get(1));
                    break;
                default:
                    deque.push(Integer.parseInt(op));
            }

        int sum = 0;

        for (int i: deque) sum += i;

        return sum;

    }
}
