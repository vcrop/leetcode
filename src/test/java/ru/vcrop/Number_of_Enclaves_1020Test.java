package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Number_of_Enclaves_1020Test {

    Number_of_Enclaves_1020 number_of_enclaves_1020;

    @BeforeEach
    void setUp() {
        number_of_enclaves_1020 = new Number_of_Enclaves_1020();
    }

    @Test
    void numEnclaves1() {
        assertEquals(3, number_of_enclaves_1020.numEnclaves(new int[][]{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}}));
    }

    @Test
    void numEnclaves2() {
        assertEquals(0, number_of_enclaves_1020.numEnclaves(new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}}));
    }
}