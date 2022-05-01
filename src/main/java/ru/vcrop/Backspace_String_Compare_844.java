package ru.vcrop;

/*Runtime: 1 ms, faster than 87.56% of Java online submissions for Backspace String Compare.
        Memory Usage: 42.4 MB, less than 31.21% of Java online submissions for Backspace String Compare.*/
public class Backspace_String_Compare_844 {

    private String sol(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch: s.toCharArray())
            if (ch == '#') {
                if (sb.length() != 0) sb.deleteCharAt(sb.length() - 1);
            } else sb.append(ch);
        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return sol(s).equals(sol(t));
    }

}
