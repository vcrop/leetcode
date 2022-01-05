package ru.vcrop;


/*https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
        Runtime: 3 ms, faster than 85.22% of Java online submissions for Pairs of Songs With Total Durations Divisible by 60.
        Memory Usage: 51.7 MB, less than 45.28% of Java online submissions for Pairs of Songs With Total Durations Divisible by 60.*/
public class Pairs_of_Songs_With_Total_Durations_Divisible_by_60_1010 {

    public int numPairsDivisibleBy60(int[] time) {
        int[] rest = new int[60];
        int count = 0;
        for (int i: time) {
            if (i % 60 == 0) count += rest[0];
            else count += rest[60 - (i % 60)];
            rest[i % 60]++;
        }
        return count;
    }
}
