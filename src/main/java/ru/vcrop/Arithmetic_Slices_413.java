package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Arithmetic Slices.
        Memory Usage: 42.4 MB, less than 14.03% of Java online submissions for Arithmetic Slices.*/
public class Arithmetic_Slices_413 {

    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        int delta = nums[1] - nums[0];
        int count = 0;
        int res = 0;
        for (int i = 2; i < nums.length; i++)
            if (nums[i] - nums[i - 1] == delta) res += ++count;
            else {
                delta = nums[i] - nums[i - 1];
                count = 0;
            }
        return res;
    }
}
