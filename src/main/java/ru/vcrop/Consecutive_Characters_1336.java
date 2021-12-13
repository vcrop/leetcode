package ru.vcrop;

import java.util.regex.Pattern;

/*https://leetcode.com/problems/consecutive-characters/
Runtime: 23 ms, faster than 10.50% of Java online submissions for Consecutive Characters.
        Memory Usage: 40.2 MB, less than 5.60% of Java online submissions for Consecutive Characters.*/
public class Consecutive_Characters_1336 {

    public int maxPower(String s) {
        return Pattern.compile("(.)\\1*").matcher(s).results().mapToInt(mr -> mr.group().length()).max().getAsInt();
    }

}
