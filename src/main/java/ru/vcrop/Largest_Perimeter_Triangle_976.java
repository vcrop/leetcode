package ru.vcrop;

import java.util.Arrays;

/*Runtime: 11 ms, faster than 43.41% of Java online submissions for Largest Perimeter Triangle.
        Memory Usage: 54.8 MB, less than 15.44% of Java online submissions for Largest Perimeter Triangle.*/
public class Largest_Perimeter_Triangle_976 {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--)
            if (nums[i] < nums[i - 1] + nums[i - 2]) return nums[i] + nums[i - 1] + nums[i - 2];
            return 0;
    }
}
