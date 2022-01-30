package ru.vcrop;
/*
https://leetcode.com/problems/rotate-array/
Runtime: 3 ms, faster than 21.98% of Java online submissions for Rotate Array.
        Memory Usage: 64.5 MB, less than 5.22% of Java online submissions for Rotate Array.*/
public class Rotate_Array_189 {

    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || k == 0) return;
        int curr = 0;
        int pointer = 0;
        int tmp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int next = (curr + k) % nums.length;
            int t = nums[next];
            nums[next] = tmp;
            tmp = t;
            curr = next;
            if (curr == pointer) {
                if (pointer < nums.length - 1) pointer++;
                tmp = nums[pointer];
                curr++;
            }
        }
    }
}
