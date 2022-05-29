package ru.vcrop;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Random_Pick_with_Blacklist_710 {

    int n;
    Random random = ThreadLocalRandom.current();

    NavigableMap<Integer,Integer> map = new TreeMap<>();

    public Random_Pick_with_Blacklist_710(int n, int[] blacklist) {
        Arrays.sort(blacklist);
        for (int i = 0; i < blacklist.length; i++)
            map.put(blacklist[i], i + 1);
        this.n = n  - map.headMap(n).size();
    }

    public int pick() {
        int value = random.nextInt(n);
        int offset = 0;
        Map.Entry<Integer,Integer> entry;
        while ((entry = map.floorEntry(value + offset)) != null && entry.getValue() != offset)
            offset = entry.getValue();
        return value + offset;
    }

}
