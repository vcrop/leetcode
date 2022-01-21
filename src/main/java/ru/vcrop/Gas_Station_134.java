package ru.vcrop;

/*https://leetcode.com/problems/gas-station/
Runtime: 3 ms, faster than 46.62% of Java online submissions for Gas Station.
        Memory Usage: 59.9 MB, less than 77.16% of Java online submissions for Gas Station.*/
public class Gas_Station_134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = -1;
        for (int i = 0; i < gas.length;) {
            if (res < 0) res = gas[i];
            else res += gas[i];
            int j = i + 1;
            for (; j < i + gas.length + 1; j++) {
                res -= cost[(j  - 1) % cost.length];
                if (res < 0) break;
                res += gas[j % gas.length];
            }
            if (j == i + gas.length + 1) return i;
            else i = j;
        }
        return -1;
    }
}
