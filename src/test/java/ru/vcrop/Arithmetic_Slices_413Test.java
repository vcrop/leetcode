package ru.vcrop;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class Arithmetic_Slices_413Test {

    public static final Object[] getParams() {
        return new Object[]{
                new Object[]{3, new int[]{1, 2, 3, 4}},
                new Object[]{0, new int[]{1}}
        };
    }

    @Test
    void numberOfArithmeticSlices() {
        Assertions.assertEquals(3, new Arithmetic_Slices_413().numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }

    @Test
    void numberOfArithmeticSlices1() {
        Assertions.assertEquals(0, new Arithmetic_Slices_413().numberOfArithmeticSlices(new int[]{1}));
    }


}