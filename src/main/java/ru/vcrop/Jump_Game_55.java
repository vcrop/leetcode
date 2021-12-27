package ru.vcrop;

/*https://leetcode.com/problems/jump-game/
        Runtime: 2 ms, faster than 74.62% of Java online submissions for Jump Game.
        Memory Usage: 39.6 MB, less than 87.23% of Java online submissions for Jump Game.*/
public class Jump_Game_55 {

    public boolean canJump(int[] nums) {
        int count = 1;
        for (int i: nums) {
            if (--count < 0) return false;
            count = Math.max(count, i);
        }
        return true;
    }

}
