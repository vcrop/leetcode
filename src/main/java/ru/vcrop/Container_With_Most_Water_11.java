package ru.vcrop;

/*Runtime: 3 ms, faster than 93.85% of Java online submissions for Container With Most Water.
        Memory Usage: 81.1 MB, less than 41.36% of Java online submissions for Container With Most Water.*/
public class Container_With_Most_Water_11 {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int max = 0;

        while (right - left > 0) {
            max = Math.max((right - left) * Math.min(height[left], height[right]), max);
            if (height[left] > height[right]) right--;
            else left++;
        }

        return max;
    }
}
