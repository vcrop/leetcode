package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Is_Subsequence_392Test {

    Is_Subsequence_392 is_subsequence_392;

    @BeforeEach
    public void init() {
        is_subsequence_392 = new Is_Subsequence_392();
    }

    @Test
    void isSubsequence() {
        Assertions.assertTrue(is_subsequence_392.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void isSubsequence1() {
        Assertions.assertFalse(is_subsequence_392.isSubsequence("axc", "ahbgdc"));
    }
}