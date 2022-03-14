package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sign_of_the_Product_of_an_Array_1822Test {

    @Test
    void arraySign() {
        Sign_of_the_Product_of_an_Array_1822 sign_of_the_product_of_an_array_1822 =
                new Sign_of_the_Product_of_an_Array_1822();
        Assertions.assertEquals(1, sign_of_the_product_of_an_array_1822.arraySign(
                new int[]{-1,-2,-3,-4,3,2,1}
        ));
        Assertions.assertEquals(0, sign_of_the_product_of_an_array_1822.arraySign(
                new int[]{1,5,0,2,-3}
        ));
        Assertions.assertEquals(-1, sign_of_the_product_of_an_array_1822.arraySign(
                new int[]{-1,1,-1,1,-1}
        ));
    }
}