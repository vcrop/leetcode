package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kth_Largest_Element_in_a_Stream_703Test {

    @Test
    public void test() {
        Kth_Largest_Element_in_a_Stream_703 kth_largest_element_in_a_stream_703 =
                new Kth_Largest_Element_in_a_Stream_703(3, new int[]{4, 5, 8, 2});
        assertEquals(4, kth_largest_element_in_a_stream_703.add(3));
        assertEquals(5, kth_largest_element_in_a_stream_703.add(5));
        assertEquals(5, kth_largest_element_in_a_stream_703.add(10));
        assertEquals(8, kth_largest_element_in_a_stream_703.add(9));
        assertEquals(8, kth_largest_element_in_a_stream_703.add(4));
    }

}