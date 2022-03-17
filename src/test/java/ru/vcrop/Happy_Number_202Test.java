package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Happy_Number_202Test {

    Happy_Number_202 happy_number_202;

    @BeforeEach
    void setUp() {
        happy_number_202 = new Happy_Number_202();
    }

    @Test
    void isHappy() {
        assertTrue(happy_number_202.isHappy(19));
    }

    @Test
    void isHappy1() {
        assertFalse(happy_number_202.isHappy(2));
    }
}