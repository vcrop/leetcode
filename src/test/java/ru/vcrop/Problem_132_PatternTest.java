package ru.vcrop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Problem_132_PatternTest {

    Problem_132_Pattern problem_132_pattern =
            new Problem_132_Pattern();

    public static Stream<Arguments> source() {
        return Stream.of(
/*                Arguments.of(true, new int[]{3, 5, 0, 3, 4}),
                Arguments.of(false, new int[]{1,2,3,4}),
                Arguments.of(true, new int[]{3,1,4,2}),
                Arguments.of(true, new int[]{-1,3,2,0}),*/
                Arguments.of(false, new int[]{1,0,1,-4,-3})
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void find132pattern(boolean expected, int[] array) {
        assertEquals(expected, problem_132_pattern.find132pattern(array));
    }
}