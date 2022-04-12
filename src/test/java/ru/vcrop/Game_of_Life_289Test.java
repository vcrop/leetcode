package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Game_of_Life_289Test {

    Game_of_Life_289 game_of_life_289;

    @BeforeEach
    void setUp() {
        game_of_life_289 = new Game_of_Life_289();
    }

    @Test
    void gameOfLife() {
        int[][] array = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        game_of_life_289.gameOfLife(array);
        assertArrayEquals(new int[][]{{0,0,0},{1,0,1},{0,1,1},{0,1,0}}, array);
    }

    @Test
    void gameOfLife2() {
        int[][] array = {{1, 1}, {1, 0}};
        game_of_life_289.gameOfLife(array);
        assertArrayEquals(new int[][]{{1, 1}, {1, 1}}, array);
    }
}