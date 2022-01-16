package ru.vcrop;

/*https://leetcode.com/problems/maximize-distance-to-closest-person/
        Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximize Distance to Closest Person.
        Memory Usage: 40.8 MB, less than 73.33% of Java online submissions for Maximize Distance to Closest Person.*/
public class Maximize_Distance_to_Closest_Person_849 {

    public int maxDistToClosest(int[] seats) {
        int left = -1;
        int right = 0;
        int max = 1;
        for (;right < seats.length; right++)
            if (seats[right] != 0) {
                max = Math.max(left == -1 ? right - left - 1 : (right - left) / 2, max);
                left = right;
            }
        return Math.max(right - left - 1, max);
    }
}
