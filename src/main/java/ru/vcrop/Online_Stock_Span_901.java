package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

/*Runtime: 37 ms, faster than 91.40% of Java online submissions for Online Stock Span.
        Memory Usage: 81 MB, less than 5.25% of Java online submissions for Online Stock Span.*/
public class Online_Stock_Span_901 {

    int index = 0;
    Deque<Integer> indexes = new LinkedList<>();
    Deque<Integer> prices = new LinkedList<>();

    public Online_Stock_Span_901() {

    }

    public int next(int price) {
        while (!prices.isEmpty() && prices.getFirst() <= price) {
            prices.pop();
            indexes.pop();
        };
        int ret = index - (prices.isEmpty() ? - 1 : indexes.getFirst());

        prices.push(price);
        indexes.push(index++);

        return ret;
    }
}
