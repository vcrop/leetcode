package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_Product_of_Word_Lengths_318Test {

    Maximum_Product_of_Word_Lengths_318 maximum_product_of_word_lengths_318 =
            new Maximum_Product_of_Word_Lengths_318();

    @Test
    void maxProduct() {
        assertEquals(16, maximum_product_of_word_lengths_318.maxProduct(
                new String[]{"abcw","baz","foo","bar","xtfn","abcdef"}
        ));
    }
}