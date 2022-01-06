package ru.vcrop;

/*https://leetcode.com/problems/car-pooling/
Runtime: 1 ms, faster than 98.57% of Java online submissions for Car Pooling.
        Memory Usage: 39.1 MB, less than 36.18% of Java online submissions for Car Pooling.*/
public class Car_Pooling_1094_alt {

    public boolean carPooling(int[][] trips, int capacity) {
        int[] to = new int[1001];
        for (int[] t: trips) {
            to[t[1]] -= t[0];
            to[t[2]] += t[0];
        }
        for (int j : to) if ((capacity += j) < 0) return false;
        return true;
    }

}
