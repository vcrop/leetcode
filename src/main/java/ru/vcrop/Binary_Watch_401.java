package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

public class Binary_Watch_401 {

    public List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn > 8) return List.of();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 1 << 10; i++)
            if (Integer.bitCount(i) == turnedOn) {
                int minutes = i & ((1 << 6) - 1);
                int hours = (i ^ minutes) >>> 6;
                if (minutes < 60 && hours < 12) result.add(String.format("%1d:%02d", hours, minutes));
            }
        return result;
    }
}
