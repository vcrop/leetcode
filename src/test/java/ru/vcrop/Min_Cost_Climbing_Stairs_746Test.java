package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Min_Cost_Climbing_Stairs_746Test {

    @Test
    void minCostClimbingStairs() {
        Min_Cost_Climbing_Stairs_746 min_cost_climbing_stairs_746 =
                new Min_Cost_Climbing_Stairs_746();
        assertEquals(15, min_cost_climbing_stairs_746.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, min_cost_climbing_stairs_746.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}