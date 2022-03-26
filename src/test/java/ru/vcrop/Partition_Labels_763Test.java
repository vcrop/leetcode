package ru.vcrop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Partition_Labels_763Test {

    Partition_Labels_763 partition_labels_763;

    @BeforeEach
    void setUp() {
        partition_labels_763 = new Partition_Labels_763();
    }

    @Test
    void partitionLabels1() {
        assertEquals(List.of(9, 7, 8), partition_labels_763.partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    void partitionLabels2() {
        assertEquals(List.of(10), partition_labels_763.partitionLabels("eccbbbbdec"));
    }
}