package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reverse_String_344Test {

    Reverse_String_344 reverse_string_344 = new Reverse_String_344();

    @Test
    void reverseString() {
        char[] in = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverse_string_344.reverseString(in);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, in);
    }
}