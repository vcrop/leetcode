package ru.vcrop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Word_Ladder_127Test {

    Word_Ladder_127 word_ladder_127 = new Word_Ladder_127();

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(7, "game", "thee",
                                new ArrayList<>(List.of("frye","heat","tree","thee","game","free","hell","fame","faye"))),
                Arguments.of(6, "leet", "code", new ArrayList<>(List.of("lest","leet","lose","code","lode","robe","lost"))),
                Arguments.of(5, "hit", "cog", new ArrayList<>(List.of("hot","dot","dog","lot","log","cog"))),
                Arguments.of(0, "hit", "cog", new ArrayList<>(List.of("hot","dot","dog","lot","log")))
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void ladderLength(int expected, String beginWord, String endWord, List<String> wordList) {
        assertEquals(expected,
                word_ladder_127.ladderLength(beginWord, endWord, wordList));
    }
}