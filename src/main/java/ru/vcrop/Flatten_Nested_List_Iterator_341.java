package ru.vcrop;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

/*Runtime: 2 ms, faster than 96.91% of Java online submissions for Flatten Nested List Iterator.
        Memory Usage: 46.3 MB, less than 65.06% of Java online submissions for Flatten Nested List Iterator.*/
public class Flatten_Nested_List_Iterator_341 implements Iterator<Integer> {



    Iterator<NestedInteger> currentIterator;
    Flatten_Nested_List_Iterator_341 innerIterator;

    public Flatten_Nested_List_Iterator_341(List<NestedInteger> nestedList) {
        this.currentIterator = nestedList.iterator();
    }

    private NestedInteger next;

    @Override
    public Integer next() {
        return innerIterator == null ? next.getInteger() : innerIterator.next();
    }

    @Override
    public boolean hasNext() {
        if (innerIterator != null && innerIterator.hasNext()) return true;
        if (!currentIterator.hasNext()) return false;
        while (currentIterator.hasNext() && !(next = currentIterator.next()).isInteger()) {
            innerIterator = new Flatten_Nested_List_Iterator_341(next.getList());
            if (innerIterator.hasNext()) return true;
        };
        innerIterator = null;
        return next.isInteger();
    }
}
