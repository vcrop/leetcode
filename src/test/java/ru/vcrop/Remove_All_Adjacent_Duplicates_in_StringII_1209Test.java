package ru.vcrop;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Remove_All_Adjacent_Duplicates_in_StringII_1209Test {

    Remove_All_Adjacent_Duplicates_in_StringII_1209 remove_all_adjacent_duplicates_in_stringII_1209 =
            new Remove_All_Adjacent_Duplicates_in_StringII_1209();

    private static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("abcd", "abcd", 2),
                Arguments.of("aa", "deeedbbcccbdaa", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void removeDuplicates(String expected, String s, int k) {
        assertEquals(expected, remove_all_adjacent_duplicates_in_stringII_1209.removeDuplicates(s, k));
    }

}