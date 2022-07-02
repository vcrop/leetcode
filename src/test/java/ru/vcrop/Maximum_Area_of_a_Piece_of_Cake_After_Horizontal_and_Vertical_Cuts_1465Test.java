package ru.vcrop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_Area_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts_1465Test {

    Maximum_Area_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts_1465
        maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts_1465 =
            new Maximum_Area_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts_1465();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(4, 5, 4, new int[]{1, 2, 4}, new int[]{1, 3}),
                Arguments.of(6, 5, 4, new int[]{3, 1}, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void maxArea(int expected, int h, int w, int[] hor, int[] vert) {
        assertEquals(expected,
                maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts_1465.maxArea(h, w, hor, vert));
    }
}