package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Odd Numbers in an Interval Range.
        Memory Usage: 41 MB, less than 38.10% of Java online submissions for Count Odd Numbers in an Interval Range.*/
public class Count_Odd_Numbers_in_an_Interval_Range_1523 {
    public int countOdds(int low, int high) {
        return  (high - low) / 2 + ((low % 2 + high % 2) > 0 ? 1 : 0);
    }
}
