package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Number_of_1_Bits_191Test {

    @Test
    void hammingWeight() {
        Number_of_1_Bits_191 number_of_1_bits_191 = new Number_of_1_Bits_191();
        assertEquals(3, number_of_1_bits_191.hammingWeight(11));
    }
}