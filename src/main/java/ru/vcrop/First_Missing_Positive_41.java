package ru.vcrop;

/*Runtime: 3 ms, faster than 88.99% of Java online submissions for First Missing Positive.
        Memory Usage: 127.8 MB, less than 38.63% of Java online submissions for First Missing Positive.*/
public class First_Missing_Positive_41 {

    public int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int value = nums[i];

            while (value > 0 && value <= nums.length && nums[value - 1] != value) {
                int tmp = nums[value - 1];
                nums[value - 1] = value;
                value = tmp;
            }

        }

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != i + 1) return i + 1;

        return nums.length + 1;
    }

}
