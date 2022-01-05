package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/find-the-town-judge/
        Runtime: 13 ms, faster than 21.13% of Java online submissions for Find the Town Judge.
        Memory Usage: 85.5 MB, less than 10.58% of Java online submissions for Find the Town Judge.*/
public class Find_the_Town_Judge_997 {

    public int findJudge(int n, int[][] trust) {
        Map<Integer,Integer> peoples = new HashMap<>();
        for (int i = 1; i <= n; i++) peoples.put(i, 0);
        for (int[] t: trust) {
            peoples.remove(t[0]);
            if (peoples.containsKey(t[1])) peoples.put(t[1], peoples.get(t[1]) + 1);
        };
        for (int p: peoples.keySet())
            if (peoples.get(p) == n - 1) return p;
        return -1;
    }
}
