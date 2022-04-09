package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class First_Missing_Positive_41Test {

    @Test
    void firstMissingPositive() {
        First_Missing_Positive_41 first_missing_positive_41 =
                new First_Missing_Positive_41();
        assertEquals(3, first_missing_positive_41.firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(2, first_missing_positive_41.firstMissingPositive(new int[]{3,4,-1,1}));
        assertEquals(1, first_missing_positive_41.firstMissingPositive(new int[]{7,8,9,11,12}));
        assertEquals(3, first_missing_positive_41.firstMissingPositive(new int[]{2, 1}));
        assertEquals(2, first_missing_positive_41.firstMissingPositive(new int[]{1}));
    }
}