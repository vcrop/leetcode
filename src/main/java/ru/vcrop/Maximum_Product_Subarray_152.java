package ru.vcrop;

/*https://leetcode.com/problems/maximum-product-subarray/
        Runtime: 1 ms, faster than 90.66% of Java online submissions for Maximum Product Subarray.
        Memory Usage: 38.6 MB, less than 76.00% of Java online submissions for Maximum Product Subarray.*/
public class Maximum_Product_Subarray_152 {

    public int maxProduct(int[] nums) {
        int max = nums[0];
        boolean negative = false;
        int mult = 1;
        int mult_negative = 1;
        for (int i: nums)
            if (i == 0) {
                mult = 1;
                mult_negative = 1;
                negative = false;
                max = Math.max(max, 0);
            } else {
                mult *= i;
                if (negative) {
                    mult_negative *= i;
                    max = Math.max(max, mult_negative);
                }
                if (i < 0 && !negative) negative = true;
                max = Math.max(max, mult);
            }

        return max;
    }
}
