package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Majority_Element_169Test {

    @Test
    void majorityElement() {
        Assertions.assertEquals(new Majority_Element_169().majorityElement(new int[]{3,2,3}), 3);
        Assertions.assertEquals(new Majority_Element_169().majorityElement(new int[]{2,2,1,1,1,2,2}), 2);
    }

}