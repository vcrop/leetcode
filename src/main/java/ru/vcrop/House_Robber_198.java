package ru.vcrop;

/*https://leetcode.com/problems/house-robber/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
        Memory Usage: 38.2 MB, less than 15.97% of Java online submissions for House Robber.*/
public class House_Robber_198 {

    public int rob(int[] nums) {
        int[] a = {0, 0};
        for (int i: nums){
            int tmp = a[0];
            a[0] = a[1] + i;
            a[1] = Math.max(tmp, a[1]);
        }
        return Math.max(a[0], a[1]);
    }

}
