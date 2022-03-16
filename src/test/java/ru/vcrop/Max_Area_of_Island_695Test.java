package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max_Area_of_Island_695Test {

    @Test
    void maxAreaOfIsland() {
        Max_Area_of_Island_695 max_area_of_island_695 = new Max_Area_of_Island_695();
        assertEquals(6, max_area_of_island_695.maxAreaOfIsland(
                new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}}));
        assertEquals(0, max_area_of_island_695.maxAreaOfIsland(new int[][]{{0,0,0,0,0,0,0,0}}));
    }
}