package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Minimum_Domino_Rotations_For_Equal_Row_1007Test {

    @Test
    void minDominoRotations() {
        Minimum_Domino_Rotations_For_Equal_Row_1007 minimum_domino_rotations_for_equal_row_1007 =
                new Minimum_Domino_Rotations_For_Equal_Row_1007();
        assertEquals(2, minimum_domino_rotations_for_equal_row_1007.minDominoRotations(
                new int[]{2,1,2,4,2,2}, new int[]{5,2,6,2,3,2}));
    }
}