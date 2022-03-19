package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Valid_Anagram_242Test {

    Valid_Anagram_242 valid_anagram_242;

    @BeforeEach
    void setUp() {
        valid_anagram_242 = new Valid_Anagram_242();
    }

    @Test
    void isAnagram1() {
        assertTrue(valid_anagram_242.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagram2() {
        assertFalse(valid_anagram_242.isAnagram("rat", "car"));
    }
}