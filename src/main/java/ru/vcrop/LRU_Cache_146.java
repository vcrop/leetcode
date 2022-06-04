package ru.vcrop;

import java.util.LinkedHashMap;
import java.util.Map;

/*Runtime: 67 ms, faster than 76.68% of Java online submissions for LRU Cache.
        Memory Usage: 116.3 MB, less than 78.57% of Java online submissions for LRU Cache.*/
public class LRU_Cache_146 {

    int capacity;
    Map<Integer, Integer> map = new LinkedHashMap<>();

    public LRU_Cache_146(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        put(key, map.get(key));
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) map.remove(key);
        else if (map.size() == capacity) {
            int lastKey = map.keySet().iterator().next();
            map.remove(lastKey);
        }
        map.put(key, value);
    }
}
