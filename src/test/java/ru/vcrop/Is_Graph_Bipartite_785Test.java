package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Is_Graph_Bipartite_785Test {

    @Test
    void isBipartite() {
        assertFalse(
                new Is_Graph_Bipartite_785().isBipartite(new int[][]{{1,2,3},{0,2},{0,1,3},{0,2}})
        );
    }

    @Test
    void isBipartite1() {
        assertTrue(
                new Is_Graph_Bipartite_785().isBipartite(new int[][]{{1, 3},{0,2},{1,3},{0,2}})
        );
    }
}