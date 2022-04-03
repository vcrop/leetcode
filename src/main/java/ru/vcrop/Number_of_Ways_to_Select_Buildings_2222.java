package ru.vcrop;

/*Runtime: 25 ms, faster than 100.00% of Java online submissions for Number of Ways to Select Buildings.
        Memory Usage: 42.9 MB, less than 100.00% of Java online submissions for Number of Ways to Select Buildings.*/
public class Number_of_Ways_to_Select_Buildings_2222 {

    public long numberOfWays(String s) {
        int summary_ones = 0;
        int summary_zeros = 0;

        for (char ch: s.toCharArray())
            if (ch == '0') summary_zeros++;
            else summary_ones++;

        long sum = 0;

        int ones = 0;
        int zeros = 0;

        for (char ch: s.toCharArray())
            if (ch == '0') {
                zeros++;
                sum += ones * (summary_ones - ones);
            } else {
                ones++;
                sum += zeros * (summary_zeros - zeros);
            }
        return sum;
    }
}
