package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arithmetic_Slices_413Test {

    @Test
    void numberOfArithmeticSlices() {
        Assertions.assertEquals(3, new Arithmetic_Slices_413().numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }

    @Test
    void numberOfArithmeticSlices1() {
        Assertions.assertEquals(0, new Arithmetic_Slices_413().numberOfArithmeticSlices(new int[]{1}));
    }
}