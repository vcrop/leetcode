package ru.vcrop;

import java.util.Iterator;

/*Runtime: 5 ms, faster than 82.84% of Java online submissions for Peeking Iterator.
        Memory Usage: 43.2 MB, less than 17.62% of Java online submissions for Peeking Iterator.*/
public class Peeking_Iterator_284 implements Iterator<Integer>{

    private Integer peekValue;
    private final Iterator<Integer> iterator;

    public Peeking_Iterator_284(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        if (iterator.hasNext()) peekValue = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return peekValue;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int tmp = peekValue;
        if (iterator.hasNext()) peekValue = iterator.next(); else peekValue = null;
        return tmp;
    }

    @Override
    public boolean hasNext() {
        return peekValue != null;
    }
}
