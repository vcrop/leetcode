package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Merge_Triplets_to_Form_Target_Triplet_1899Test {

    Merge_Triplets_to_Form_Target_Triplet_1899 merge_triplets_to_form_target_triplet_1899 =
            new Merge_Triplets_to_Form_Target_Triplet_1899();

    @Test
    void mergeTriplets() {
        assertTrue(merge_triplets_to_form_target_triplet_1899.mergeTriplets(new int[][]{{2,5,3},{1,8,4},{1,7,5}}, new int[]{2, 7, 5}));
    }

    @Test
    void mergeTriplets1() {
        assertTrue(merge_triplets_to_form_target_triplet_1899.mergeTriplets(new int[][]{{2,5,3},{2,3,4},{1,2,5},{5,2,3}}, new int[]{5, 5, 5}));
    }

    @Test
    void mergeTriplets2() {
        assertFalse(merge_triplets_to_form_target_triplet_1899.mergeTriplets(new int[][]{{3,4,5},{4,5,6}}, new int[]{3, 2, 5}));
    }
}