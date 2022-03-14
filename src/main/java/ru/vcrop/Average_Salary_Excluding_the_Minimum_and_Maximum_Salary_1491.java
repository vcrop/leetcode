package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
        Memory Usage: 41.7 MB, less than 47.97% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.*/
public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary_1491 {

    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (int s: salary) {
            min = Math.min(min, s);
            max = Math.max(max, s);
            sum += s;
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }
}
