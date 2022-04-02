package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
        Memory Usage: 42 MB, less than 75.54% of Java online submissions for Sort Colors.*/
public class Sort_Colors_75 {

    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for (int i: nums)
            colors[i]++;
        int pointer = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < colors[i]; j++) nums[pointer++] = i;
    }
}
