package ru.vcrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Valid_Palindrome_II_680Test {

    @Test
    void validPalindrome() {
        assertTrue(new Valid_Palindrome_II_680().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    @Test
    void validPalindrome1() {
        assertFalse(new Valid_Palindrome_II_680().validPalindrome("abc"));
    }
}