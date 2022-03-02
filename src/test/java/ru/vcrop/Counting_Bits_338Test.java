package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Counting_Bits_338Test {

    Counting_Bits_338 counting_bits_338;

    @BeforeEach
    public void init() {
        counting_bits_338 = new Counting_Bits_338();
    }

    @Test
    void countBits() {
        Assertions.assertArrayEquals(new int[]{0, 1, 1}, counting_bits_338.countBits(2));
    }

    @Test
    void countBits1() {
        Assertions.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, counting_bits_338.countBits(5));
    }
}