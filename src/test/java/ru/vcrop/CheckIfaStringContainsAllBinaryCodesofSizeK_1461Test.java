package ru.vcrop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfaStringContainsAllBinaryCodesofSizeK_1461Test {

    CheckIfaStringContainsAllBinaryCodesofSizeK_1461 checkIfaStringContainsAllBinaryCodesofSizeK_1461 =
            new CheckIfaStringContainsAllBinaryCodesofSizeK_1461();

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(true, "10010011", 2),
                Arguments.of(true, "00110110", 2),
                Arguments.of(true, "0110", 1),
                Arguments.of(false, "0110", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void hasAllCodes(boolean expected, String s, int k) {
        assertEquals(expected, checkIfaStringContainsAllBinaryCodesofSizeK_1461.hasAllCodes(
                s, k
        ));
    }
}