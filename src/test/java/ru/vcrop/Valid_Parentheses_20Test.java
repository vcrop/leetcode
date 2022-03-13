package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Valid_Parentheses_20Test {

    Valid_Parentheses_20 valid_parentheses_20;

    @BeforeEach
    void setUp() {
        valid_parentheses_20 = new Valid_Parentheses_20();
    }

    @Test
    void isValid1() {
        Assertions.assertTrue(valid_parentheses_20.isValid("()"));
    }

    @Test
    void isValid2() {
        Assertions.assertTrue(valid_parentheses_20.isValid("()[]{}"));
    }

    @Test
    void isValid3() {
        Assertions.assertFalse(valid_parentheses_20.isValid("(]"));
    }
}