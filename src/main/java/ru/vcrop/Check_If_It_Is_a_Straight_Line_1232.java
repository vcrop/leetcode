package ru.vcrop;

/*Runtime: 1 ms, faster than 35.86% of Java online submissions for Check If It Is a Straight Line.
        Memory Usage: 44.1 MB, less than 33.61% of Java online submissions for Check If It Is a Straight Line.*/
public class Check_If_It_Is_a_Straight_Line_1232 {

    public boolean checkStraightLine(int[][] coordinates) {
        int d_x = coordinates[1][0] - coordinates[0][0];
        int d_y = coordinates[1][1] - coordinates[0][1];
        for (int[] coor: coordinates)
            if ((coor[0] - coordinates[0][0]) * d_y != (coor[1] - coordinates[0][1]) * d_x) return false;
        return true;
    }
}
