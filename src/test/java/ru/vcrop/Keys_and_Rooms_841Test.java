package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Keys_and_Rooms_841Test {

    Keys_and_Rooms_841 keys_and_rooms_841;

    @BeforeEach
    void setUp() {
        keys_and_rooms_841 = new Keys_and_Rooms_841();
    }

    @Test
    void canVisitAllRooms() {
        assertTrue(keys_and_rooms_841.canVisitAllRooms(List.of(List.of(1),List.of(2),List.of(3), List.of())));
    }
}