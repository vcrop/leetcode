package ru.vcrop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Network_Delay_Time_734Test {

    Network_Delay_Time_734 network_delay_time_734 =
            new Network_Delay_Time_734();

    private static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4, 2, 2),
                Arguments.of(new int[][]{{1,2,1}}, 2, 1, 1),
                Arguments.of(new int[][]{{1,2,1}}, 2, 2, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void networkDelayTime(int[][] times, int n, int k, int expected) {
        assertEquals(expected, network_delay_time_734.networkDelayTime(times, n, k));
    }
}