package ru.vcrop;

/*Runtime: 212 ms, faster than 33.33% of Java online submissions for Find Triangular Sum of an Array.
        Memory Usage: 48.2 MB, less than 50.00% of Java online submissions for Find Triangular Sum of an Array.*/
public class Find_Triangular_Sum_of_an_Array_2221 {

    public int triangularSum(int[] nums) {
        for (int i = nums.length; i > 1; i--) {
            for (int j = 0; j < nums.length - 1; j++)
                nums[j] = (nums[j] + nums[j + 1]) % 10;
        }
        return nums[0];
    }
}
