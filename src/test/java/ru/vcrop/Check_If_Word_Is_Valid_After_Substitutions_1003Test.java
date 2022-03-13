package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Check_If_Word_Is_Valid_After_Substitutions_1003Test {

    @Test
    void isValid() {
        Check_If_Word_Is_Valid_After_Substitutions_1003 check_if_word_is_valid_after_substitutions_1003 =
                new Check_If_Word_Is_Valid_After_Substitutions_1003();
        Assertions.assertTrue(check_if_word_is_valid_after_substitutions_1003.isValid("aabcbc"));
    }

    @Test
    void isValid1() {
        Check_If_Word_Is_Valid_After_Substitutions_1003 check_if_word_is_valid_after_substitutions_1003 =
                new Check_If_Word_Is_Valid_After_Substitutions_1003();
        Assertions.assertTrue(check_if_word_is_valid_after_substitutions_1003.isValid("abcabcababcc"));
    }

    @Test
    void isValid2() {
        Check_If_Word_Is_Valid_After_Substitutions_1003 check_if_word_is_valid_after_substitutions_1003 =
                new Check_If_Word_Is_Valid_After_Substitutions_1003();
        Assertions.assertFalse(check_if_word_is_valid_after_substitutions_1003.isValid("abccba"));
    }
}