package ru.vcrop;

/*https://leetcode.com/problems/next-permutation/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Next Permutation.
        Memory Usage: 38.8 MB, less than 97.23% of Java online submissions for Next Permutation.*/
public class Next_Permutation_31 {

    public void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length - 2; i > -1; i--)
            if (nums[i] < nums[i + 1]) break;
        if (i != -1) {
            int j;
            for (j = nums.length - 1; j > i; j--)
                if (nums[i] < nums[j]) break;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        int l = i + 1, h = nums.length - 1;

        while (l < h) {
            int tmp = nums[l];
            nums[l] = nums[h];
            nums[h] = tmp;
            l++;
            h--;
        }


    }
}
