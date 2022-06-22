package ru.vcrop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Basic_Calculator_224Test {

    Basic_Calculator_224 basic_calculator_224 =
            new Basic_Calculator_224();

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(2, "1 + 1"),
                Arguments.of(3, " 2-1 + 2 "),
                Arguments.of(23, "(1+(4+5+2)-3)+(6+8)")
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void calculate(int expected, String s) {
        assertEquals(expected,
                basic_calculator_224.calculate(s));
    }
}