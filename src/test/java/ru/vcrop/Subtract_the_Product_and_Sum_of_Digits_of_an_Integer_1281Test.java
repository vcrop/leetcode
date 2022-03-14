package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281Test {

    @Test
    void subtractProductAndSum() {
        Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 subtract_the_product_and_sum_of_digits_of_an_integer_1281 =
                new Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281();
        Assertions.assertEquals(15, subtract_the_product_and_sum_of_digits_of_an_integer_1281.subtractProductAndSum(234));
        Assertions.assertEquals(21, subtract_the_product_and_sum_of_digits_of_an_integer_1281.subtractProductAndSum(4421));
    }
}