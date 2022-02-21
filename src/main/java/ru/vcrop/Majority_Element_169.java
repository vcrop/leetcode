package ru.vcrop;

/*https://leetcode.com/problems/majority-element/
Runtime: 2 ms, faster than 82.16% of Java online submissions for Majority Element.
        Memory Usage: 57.2 MB, less than 5.16% of Java online submissions for Majority Element.*/
public class Majority_Element_169 {

    public int majorityElement(int[] nums) {
        int count = 1;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++)
            if (result == nums[i]) count++;
            else if (count-- == 1) {
                result = nums[i];
                count = 1;
            };
        return result;
    }
}
