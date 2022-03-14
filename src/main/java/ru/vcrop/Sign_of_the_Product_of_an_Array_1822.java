package ru.vcrop;

/*Runtime: 1 ms, faster than 64.81% of Java online submissions for Sign of the Product of an Array.
        Memory Usage: 44.2 MB, less than 25.97% of Java online submissions for Sign of the Product of an Array.*/
public class Sign_of_the_Product_of_an_Array_1822 {

    public int arraySign(int[] nums) {
        boolean positive = true;
        for (int i: nums) {
            positive = (i < 0) != positive;
            if (i == 0) return 0;
        }
        return positive ? 1 : -1;
    }
}
