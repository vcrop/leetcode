package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

public class Count_Good_Meals_1711 {

    public int countPairs(int[] deliciousness) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i: deliciousness)
            map.merge(i, 1, Integer::sum);

        int ret = 0;
        int same = 0;

        for (int key: map.keySet())
            for (int pow = 1; pow < 1 << 22; pow <<= 1)
                if (map.containsKey(pow - key)) {
                    if (key == pow - key) same = (same + map.get(key) * (map.get(key) - 1) / 2) % (int) (1e9 + 7);
                    else ret = (ret + (map.get(key) * map.get(pow - key))) % (int) (1e9 + 7);
                }

        return ret / 2 + same;
    }

}
