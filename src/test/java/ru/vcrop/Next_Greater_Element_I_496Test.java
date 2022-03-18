package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Next_Greater_Element_I_496Test {

    Next_Greater_Element_I_496 next_greater_element_i_496;

    @BeforeEach
    void setUp() {
        next_greater_element_i_496 = new Next_Greater_Element_I_496();
    }

    @Test
    void nextGreaterElement1() {
        assertArrayEquals(new int[]{-1, 3, -1},
                next_greater_element_i_496.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
    }

    @Test
    void nextGreaterElement2() {
        assertArrayEquals(new int[]{3, -1},
                next_greater_element_i_496.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }
}