package ru.vcrop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Count_Sorted_Vowel_Strings_1641Test {

    Count_Sorted_Vowel_Strings_1641 count_sorted_vowel_strings_1641 =
            new Count_Sorted_Vowel_Strings_1641();

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(5, 1),
                Arguments.of(15, 2),
                Arguments.of(66045, 33)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void countVowelStrings(int expected, int n) {
        assertEquals(expected, count_sorted_vowel_strings_1641.countVowelStrings(n));
    }

}