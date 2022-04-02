package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sort_Colors_75Test {

    @Test
    void sortColors() {
        Sort_Colors_75 sort_colors_75 = new Sort_Colors_75();
        int[] array = new int[]{2,0,2,1,1,0};
        sort_colors_75.sortColors(array);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, array);
    }
}