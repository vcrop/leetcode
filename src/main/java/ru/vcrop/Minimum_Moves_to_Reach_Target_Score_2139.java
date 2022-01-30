package ru.vcrop;

/*https://leetcode.com/problems/minimum-moves-to-reach-target-score/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Moves to Reach Target Score.
        Memory Usage: 40.9 MB, less than 6.38% of Java online submissions for Minimum Moves to Reach Target Score*/
public class Minimum_Moves_to_Reach_Target_Score_2139 {

    public int minMoves(int target, int maxDoubles) {
        int count = 0;
        while (target != 1) {
            if (maxDoubles == 0) return count + target - 1;
            if (target % 2 == 0) {
                target /= 2;
                maxDoubles--;
            } else target--;
            count++;
        };
        return count;
    }
}
