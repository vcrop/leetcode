package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Find_the_Duplicate_Number_287Test {

    Find_the_Duplicate_Number_287 find_the_duplicate_number_287;

    @BeforeEach
    void setUp() {
        find_the_duplicate_number_287 = new Find_the_Duplicate_Number_287();
    }

    @Test
    void findDuplicate() {
        assertEquals(2, find_the_duplicate_number_287.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }

    @Test
    void findDuplicate2() {
        assertEquals(3, find_the_duplicate_number_287.findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }
}