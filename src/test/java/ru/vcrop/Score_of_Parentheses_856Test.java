package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Score_of_Parentheses_856Test {

    Score_of_Parentheses_856 score_of_parentheses_856;

    @BeforeEach
    void setUp() {
        score_of_parentheses_856 = new Score_of_Parentheses_856();
    }

    @Test
    void scoreOfParentheses1() {
        assertEquals(1, score_of_parentheses_856.scoreOfParentheses("()"));
    }

    @Test
    void scoreOfParentheses2() {
        assertEquals(2, score_of_parentheses_856.scoreOfParentheses("(())"));
    }

    @Test
    void scoreOfParentheses3() {
        assertEquals(2, score_of_parentheses_856.scoreOfParentheses("()()"));
    }
}