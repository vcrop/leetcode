package ru.vcrop;

import java.util.*;

/*Runtime: 70 ms, faster than 25.47% of Java online submissions for Maximum Frequency Stack.
        Memory Usage: 50.7 MB, less than 92.25% of Java online submissions for Maximum Frequency Stack.*/
public class Maximum_Frequency_Stack_895 {

    public static class Element{
        private final int value;
        private final int count;
        private final int pos;

        public Element(int value, int count, int pos) {
            this.value = value;
            this.count = count;
            this.pos = pos;
        }
        public int getValue() {
            return value;
        }

        public int getCount() {
            return count;
        }

        public int getPos() {
            return pos;
        }
    }

    private int size;
    private final Map<Integer,Integer> counter;
    private final Queue<Element> queue;

    public Maximum_Frequency_Stack_895() {
        size = 0;
        counter = new HashMap<>();
        queue = new PriorityQueue<>(Comparator.comparingInt(Element::getCount)
                .thenComparingInt(Element::getPos).reversed());
    }

    public void push(int val) {
        queue.add(new Element(val, counter.merge(val, 1, (a, b) -> a + 1), ++size));
    }

    public int pop() {
        int val = queue.poll().getValue();
        counter.merge(val, 0, (a, b) -> a - 1);
        return val;
    }
}
