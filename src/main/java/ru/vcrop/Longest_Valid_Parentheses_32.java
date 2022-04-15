package ru.vcrop;

/*Runtime: 1 ms, faster than 100.00% of Java online submissions for Longest Valid Parentheses.
        Memory Usage: 42.3 MB, less than 83.93% of Java online submissions for Longest Valid Parentheses.*/
public class Longest_Valid_Parentheses_32 {

    public int longestValidParentheses(String s) {
        int[] l = new int[s.length()];

        int current = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')')
                if (i - current - 1 > -1)
                    if (s.charAt(i - current - 1) == '(') {
                        current += 2;
                        if (i - current > -1) current += l[i - current];
                    } else current = 0;
                else current = 0;
            else current = 0;
            l[i] = current;
            max = Math.max(max, current);
        }
        return max;
    };
}
