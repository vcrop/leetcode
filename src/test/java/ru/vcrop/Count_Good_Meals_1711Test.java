package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Count_Good_Meals_1711Test {

    Count_Good_Meals_1711 count_good_meals_1711 =
            new Count_Good_Meals_1711();

    @Test
    void countPairs() {
        assertEquals(4, count_good_meals_1711.countPairs(new int[]{1,3,5,7,9}));
    }

    @Test
    void countPairs1() {
        assertEquals(15, count_good_meals_1711.countPairs(new int[]{1,1,1,3,3,3,7}));
    }
}