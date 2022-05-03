package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sort_Array_By_Parity_905Test {

    Sort_Array_By_Parity_905 sort_array_by_parity_905 =
            new Sort_Array_By_Parity_905();

    @Test
    void sortArrayByParity() {
        assertArrayEquals(new int[]{2,4,3,1},
                sort_array_by_parity_905.sortArrayByParity(new int[]{3,1,2,4}));
    }

}