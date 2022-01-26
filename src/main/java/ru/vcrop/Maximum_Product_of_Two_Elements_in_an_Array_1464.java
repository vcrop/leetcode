package ru.vcrop;

/*https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
        Runtime: 1 ms, faster than 79.50% of Java online submissions for Maximum Product of Two Elements in an Array.
        Memory Usage: 40.3 MB, less than 29.34% of Java online submissions for Maximum Product of Two Elements in an Array.*/
public class Maximum_Product_of_Two_Elements_in_an_Array_1464 {

    public int maxProduct(int[] nums) {
        int[] maxs = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i: nums)
            if (i > maxs[0]) {
                int tmp = maxs[0];
                maxs[0] = i;
                maxs[1] = tmp;
            } else if (i > maxs[1]) maxs[1] = i;
        return (maxs[0] - 1) * (maxs[1] - 1);

    }

}
