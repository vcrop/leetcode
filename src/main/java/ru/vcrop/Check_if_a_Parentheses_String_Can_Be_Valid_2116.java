package ru.vcrop;

/*https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/
        Runtime: 24 ms, faster than 31.02% of Java online submissions for Check if a Parentheses String Can Be Valid.
        Memory Usage: 64.5 MB, less than 12.15% of Java online submissions for Check if a Parentheses String Can Be Valid.*/
public class Check_if_a_Parentheses_String_Can_Be_Valid_2116 {

    private boolean subSum(String s, String locked, int[] arr, char ch) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (locked.charAt(i) == '0') {
                arr[0] -= 1;
                arr[1] += 1;
            } else {
                int change = s.charAt(i) == ch ? 1 : -1;
                arr[0] += change;
                arr[1] += change;
            };
            arr[0] = Math.max(0, arr[0]);
            if (arr[1] < 0) return false;
        }
        return true;
    }

    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 == 1) return false;
        int[] left = new int[2];
        if (!subSum(s, locked, left, '(')) return false;
        int[] right = new int[2];
        if (!subSum(new StringBuilder(s).reverse().toString(), new StringBuilder(locked).reverse().toString(), right, ')')) return false;
        return right[0] < left[0] ? right[1] >= left[0] : right[0] <= left[1];

    }
}
