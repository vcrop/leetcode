package ru.vcrop;

import java.util.Arrays;

/*Runtime: 1 ms, faster than 99.51% of Java online submissions for Can Make Arithmetic Progression From Sequence.
        Memory Usage: 40.4 MB, less than 85.74% of Java online submissions for Can Make Arithmetic Progression From Sequence.*/
public class Can_Make_Arithmetic_Progression_From_Sequence_1502 {

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int delta = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i + 1] - arr[i] != delta) return false;
        return true;
    }
}
