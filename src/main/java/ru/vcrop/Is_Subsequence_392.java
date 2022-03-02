package ru.vcrop;

public class Is_Subsequence_392 {

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        char[] chars = s.toCharArray();
        int pointer = 0;
        for (char ch: t.toCharArray())
            if (ch == chars[pointer]) {
                pointer++;
                if (pointer == chars.length) return true;
            }
        return false;
    }
}
