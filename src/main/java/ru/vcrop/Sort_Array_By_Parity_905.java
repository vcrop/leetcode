package ru.vcrop;

/*Runtime: 1 ms, faster than 96.63% of Java online submissions for Sort Array By Parity.
        Memory Usage: 48.5 MB, less than 36.86% of Java online submissions for Sort Array By Parity.*/
public class Sort_Array_By_Parity_905 {

    public int[] sortArrayByParity(int[] nums) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = tmp;
                pointer++;
            }
        return nums;
    }
}
