package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Nth_Tribonacci_Number_1137Test {

    Nth_Tribonacci_Number_1137 nth_tribonacci_number_1137 =
            new Nth_Tribonacci_Number_1137();

    @Test
    void tribonacci() {
        assertEquals(4, nth_tribonacci_number_1137.tribonacci(4));
    }

    @Test
    void tribonacci1() {
        assertEquals(1389537, nth_tribonacci_number_1137.tribonacci(25));
    }
}