package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
        Memory Usage: 40.7 MB, less than 60.74% of Java online submissions for Number of Steps to Reduce a Number to Zero.*/
public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {

    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 0) num >>>= 1;
            else num ^= 1;
            count++;
        };
        return count;
    }
}
