package ru.vcrop;
/*
Runtime: 1 ms, faster than 84.55% of Java online submissions for Reverse String.
        Memory Usage: 58.1 MB, less than 13.40% of Java online submissions for Reverse String*/
public class Reverse_String_344 {

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
