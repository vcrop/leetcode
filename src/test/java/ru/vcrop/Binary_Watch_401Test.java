package ru.vcrop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Binary_Watch_401Test {

    @Test
    void readBinaryWatch() {
        Binary_Watch_401 binary_watch_401 = new Binary_Watch_401();
        assertEquals(List.of("0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"),
                binary_watch_401.readBinaryWatch(1));
        assertEquals(List.of(),
                binary_watch_401.readBinaryWatch(9));
    }
}