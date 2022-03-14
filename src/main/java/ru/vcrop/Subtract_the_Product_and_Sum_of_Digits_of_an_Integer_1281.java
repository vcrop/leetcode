package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
        Memory Usage: 41.6 MB, less than 8.92% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.*/
public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 {

    public int subtractProductAndSum(int n) {
        int mult = 1;
        int sum  = 0;
        while (n != 0) {
            mult *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return mult - sum;
    }
}
