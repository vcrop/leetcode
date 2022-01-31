package ru.vcrop;

/*https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number in Binary Representation to One.
        Memory Usage: 42.1 MB, less than 14.71% of Java online submissions for Number of Steps to Reduce a Number in Binary Representation to One.*/
public class Number_of_Steps_to_Reduce_a_Number_in_Binary_Representation_to_One_1404 {

    public int numSteps(String s) {
        int add = 0;
        int count = 0;
        for (int i = s.length() - 1; i > 0; i--)
            if (s.charAt(i) == '0') {
                if (add == 1) {
                    count += 2;
                } else count++;
            } else if (add == 1) count++;
            else {
                count += 2;
                add = 1;
            }
        return count + (add == 1 ? 1 : 0);
    }
}
