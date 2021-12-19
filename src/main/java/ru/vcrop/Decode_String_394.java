package ru.vcrop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*https://leetcode.com/problems/decode-string/
        Runtime: 7 ms, faster than 8.30% of Java online submissions for Decode String.
        Memory Usage: 38.4 MB, less than 31.47% of Java online submissions for Decode String.*/
public class Decode_String_394 {

    public String decodeString(String s) {
        Matcher matcher = Pattern.compile("(\\d+)\\[([^\\[\\]]*)\\]").matcher(s);
        while (matcher.reset(s).find()) s = matcher.replaceFirst(decodeString(matcher.group(2)).repeat(Integer.parseInt(matcher.group(1))));
        return s;
    }
}
