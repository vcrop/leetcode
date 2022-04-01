package ru.vcrop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Triangle_120Test {

    @Test
    void minimumTotal() {
        Triangle_120 triangle_120 = new Triangle_120();
        assertEquals(11, triangle_120.minimumTotal(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3))));
    }
}