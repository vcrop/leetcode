package ru.vcrop;

/*https://leetcode.com/problems/robot-bounded-in-circle/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Robot Bounded In Circle.
        Memory Usage: 37.3 MB, less than 44.03% of Java online submissions for Robot Bounded In Circle.*/
public class Robot_Bounded_In_Circle_1041 {

    public boolean isRobotBounded(String instructions) {
        int rotate = 0;
        int[] pos = {0, 0};
        for (char ch: instructions.toCharArray()) {
            if (ch == 'L') rotate = (rotate + 1) % 4;
            else if (ch == 'R') rotate = (rotate + 3) % 4;
            else {
                pos[0] += rotate == 0 ? 1 : rotate == 2 ? -1 : 0;
                pos[1] += rotate == 1 ? -1 : rotate == 3 ? 1 : 0;
            }
        }
        return rotate % 4 != 0 || pos[0] == 0 && pos[1] == 0;
    }
}
