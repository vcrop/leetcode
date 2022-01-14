package ru.vcrop;

/*https://leetcode.com/problems/string-to-integer-atoi/
        Runtime: 3 ms, faster than 49.08% of Java online submissions for String to Integer (atoi).
        Memory Usage: 39.7 MB, less than 24.76% of Java online submissions for String to Integer (atoi).*/
public class String_to_Integer_8 {

    public int myAtoi(String s) {
        if (s.isEmpty()) return 0;
        int res = 0;
        int sign = 1;
        int pos = 0;
        while (s.charAt(pos) == ' ') {
            pos++;
            if (pos == s.length()) return 0;
        }
        if (s.charAt(pos) == '+' || s.charAt(pos) == '-') {
            sign = s.charAt(pos++) == '+' ? 1 : -1;
            if (pos == s.length()) return 0;
        }
        while (s.charAt(pos) == '0') {
            pos++;
            if (pos == s.length()) return 0;
        }
        while (pos < s.length()) {
            char c = s.charAt(pos++);
            if (c < '0' || c > '9') return res;
            int tmp = sign < 0 ? res * 10 - (c - '0') : res * 10 + (c - '0');
            if (tmp / 10 != res) return sign < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            else res = tmp;
        }
        return res;
    }
}
