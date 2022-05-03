package ru.vcrop;

import junitparams.JUnitParamsRunner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

class Shortest_Unsorted_Continuous_Subarray_581Test {

    @Test
    void findUnsortedSubarray() {
        assertEquals(5,
                new Shortest_Unsorted_Continuous_Subarray_581().findUnsortedSubarray(new int[]{2,6,4,8,10,9,15}));
    }

    @Test
    void find() {
        assertEquals(2,
                new Shortest_Unsorted_Continuous_Subarray_581().findUnsortedSubarray(new int[]{2, 1}));
    }

    @Test
    void find1() {
        assertEquals(4,
                new Shortest_Unsorted_Continuous_Subarray_581().findUnsortedSubarray(new int[]{1, 3, 2, 2, 2}));
    }

    @Test
    void find11() {
        assertEquals(0,
                new Shortest_Unsorted_Continuous_Subarray_581().findUnsortedSubarray(new int[]{1, 2, 3, 4}));
    }
}