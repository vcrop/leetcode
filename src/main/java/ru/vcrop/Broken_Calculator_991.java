package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Broken Calculator.
        Memory Usage: 39 MB, less than 88.74% of Java online submissions for Broken Calculator.*/
public class Broken_Calculator_991 {

    public int brokenCalc(int startValue, int target) {
        int count = 0;
        while (target != startValue) {
            if (target < startValue) return (count + startValue - target) ;
            if (target % 2 == 1) target++;
            else target /= 2;
            count++;
        };
        return count;
    }
}
