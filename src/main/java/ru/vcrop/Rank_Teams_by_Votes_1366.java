package ru.vcrop;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/rank-teams-by-votes/
Runtime: 20 ms, faster than 36.95% of Java online submissions for Rank Teams by Votes.
        Memory Usage: 42 MB, less than 31.30% of Java online submissions for Rank Teams by Votes.*/
public class Rank_Teams_by_Votes_1366 {

    public String rankTeams(String[] votes) {
        Map<Character,int[]> map = new HashMap<>();

        for (String vote: votes)
            for (int i = 0; i < vote.length(); i++)
                map.computeIfAbsent(vote.charAt(i), k -> new int[26])[i]++;

        Comparator<int[]> cmp = Comparator.comparingInt((int[] a) -> a[0]);

        for (int i = 1; i < map.size(); i++) {
            final int j = i;
            cmp = cmp.thenComparingInt((int[] a) -> a[j]);
        };

        cmp = cmp.reversed();

        StringBuilder sb = new StringBuilder();

        map.entrySet().stream().sorted(Map.Entry.comparingByValue(cmp)).map(Map.Entry::getKey)
                .forEach(sb::append);


        return sb.toString();
    }
}
