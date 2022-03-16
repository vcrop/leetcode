package ru.vcrop;

/*Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Nearest Point That Has the Same X or Y Coordinate.
        Memory Usage: 49.7 MB, less than 91.36% of Java online submissions for Find Nearest Point That Has the Same X or Y Coordinate.*/
public class Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate_1779 {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int smallest_index = -1;
        int smallest_value = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++)
            if (x == points[i][0] || y == points[i][1]) {
                int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (distance < smallest_value) {
                    smallest_value = distance;
                    smallest_index = i;
                }
            }
        return smallest_index;
    }
}
