package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bitwise_AND_of_Numbers_Range_201Test {

    Bitwise_AND_of_Numbers_Range_201 bitwise_and_of_numbers_range_201 =
            new Bitwise_AND_of_Numbers_Range_201();

    @Test
    void rangeBitwiseAnd() {
        assertEquals(4, bitwise_and_of_numbers_range_201.rangeBitwiseAnd(5, 7));
        assertEquals(8, bitwise_and_of_numbers_range_201.rangeBitwiseAnd(11, 13));
    }
}