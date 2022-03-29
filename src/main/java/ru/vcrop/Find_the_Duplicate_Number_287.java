package ru.vcrop;

/*Runtime: 5 ms, faster than 86.43% of Java online submissions for Find the Duplicate Number.
        Memory Usage: 59.2 MB, less than 97.86% of Java online submissions for Find the Duplicate Number.*/
public class Find_the_Duplicate_Number_287 {

    public int findDuplicate(int[] nums) {
        int pos = 0;
        while (pos < nums.length) {
            int k = pos;
            while (nums[k] != k + 1) {
                int tmp = nums[nums[k] - 1];
                if (nums[k] == tmp) return tmp;
                nums[nums[k] - 1] = nums[k];
                nums[k] = tmp;
            }
            pos++;
        }
        return -1;
    }
}
