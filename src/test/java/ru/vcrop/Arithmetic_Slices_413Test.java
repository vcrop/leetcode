package ru.vcrop;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.jupiter.api.Assertions.*;


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