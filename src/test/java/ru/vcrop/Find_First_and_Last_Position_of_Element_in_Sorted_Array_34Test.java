package ru.vcrop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34Test {

    Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 find_first_and_last_position_of_element_in_sorted_array_34 =
            new Find_First_and_Last_Position_of_Element_in_Sorted_Array_34();

    public static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{3, 4}, new int[]{5,7,7,8,8,10}, 8),
                Arguments.of(new int[]{-1, -1}, new int[]{5,7,7,8,8,10}, 6),
                Arguments.of(new int[]{-1, -1}, new int[]{}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void searchRange(int[] expected, int[] nums, int target) {
        assertArrayEquals(expected,
                find_first_and_last_position_of_element_in_sorted_array_34.searchRange(nums, target));
    }
}