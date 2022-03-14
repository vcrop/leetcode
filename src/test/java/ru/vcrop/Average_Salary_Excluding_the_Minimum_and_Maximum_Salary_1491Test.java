package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary_1491Test {

    @Test
    void average() {
        Average_Salary_Excluding_the_Minimum_and_Maximum_Salary_1491 average_salary_excluding_the_minimum_and_maximum_salary_1491 =
                new Average_Salary_Excluding_the_Minimum_and_Maximum_Salary_1491();
        Assertions.assertEquals(2500., average_salary_excluding_the_minimum_and_maximum_salary_1491.average(
                new int[]{4000, 3000, 1000, 2000}
        ));
        Assertions.assertEquals(2000., average_salary_excluding_the_minimum_and_maximum_salary_1491.average(
                new int[]{1000, 2000, 3000}
        ));
    }
}