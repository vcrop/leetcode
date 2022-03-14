package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Largest_Perimeter_Triangle_976Test {

    @Test
    void largestPerimeter() {
        Largest_Perimeter_Triangle_976 largest_perimeter_triangle_976 =
                new Largest_Perimeter_Triangle_976();
        Assertions.assertEquals(5, largest_perimeter_triangle_976.largestPerimeter(new int[]{2, 1, 2}));
        Assertions.assertEquals(0, largest_perimeter_triangle_976.largestPerimeter(new int[]{1, 2, 1}));
    }
}