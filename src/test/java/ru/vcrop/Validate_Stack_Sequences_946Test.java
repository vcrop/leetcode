package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Validate_Stack_Sequences_946Test {

    Validate_Stack_Sequences_946 validate_stack_sequences_946;

    @BeforeEach
    void setUp() {
        validate_stack_sequences_946 = new Validate_Stack_Sequences_946();
    }

    @Test
    void validateStackSequences() {
        assertTrue(validate_stack_sequences_946.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }

    @Test
    void validateStackSequences1() {
        assertFalse(validate_stack_sequences_946.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
    }
}