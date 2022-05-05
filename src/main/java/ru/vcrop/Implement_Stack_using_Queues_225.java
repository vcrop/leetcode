package ru.vcrop;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;


/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Stack using Queues.
        Memory Usage: 42 MB, less than 28.59% of Java online submissions for Implement Stack using Queues.*/
public class Implement_Stack_using_Queues_225 {

    Queue<Integer> queue = new ArrayDeque<>();

    public Implement_Stack_using_Queues_225() {

    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {

        if (empty()) throw new NoSuchElementException();

        Queue<Integer> tmp = new ArrayDeque<>();

        int last = 0;

        while (!empty()) {
            last = queue.poll();
            if (!empty()) tmp.add(last);
        }

        queue = tmp;

        return last;
    }

    public int top() {
        if (empty()) throw new NoSuchElementException();

        Queue<Integer> tmp = new ArrayDeque<>();

        int last = 0;

        while (!empty()) {
            last = queue.poll();
            tmp.add(last);
        }

        queue = tmp;

        return last;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
