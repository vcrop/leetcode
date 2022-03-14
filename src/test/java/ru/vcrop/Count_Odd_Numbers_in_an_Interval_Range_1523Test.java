package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Count_Odd_Numbers_in_an_Interval_Range_1523Test {

    @Test
    void countOdds() {
        Count_Odd_Numbers_in_an_Interval_Range_1523 count_odd_numbers_in_an_interval_range_1523 =
                new Count_Odd_Numbers_in_an_Interval_Range_1523();
        Assertions.assertEquals(3, count_odd_numbers_in_an_interval_range_1523.countOdds(3, 7));
        Assertions.assertEquals(1, count_odd_numbers_in_an_interval_range_1523.countOdds(8, 10));
    }
}