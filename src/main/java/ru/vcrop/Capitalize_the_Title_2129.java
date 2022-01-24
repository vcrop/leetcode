package ru.vcrop;

import java.util.regex.Pattern;

/*https://leetcode.com/problems/capitalize-the-title/
        Runtime: 20 ms, faster than 16.26% of Java online submissions for Capitalize the Title.
        Memory Usage: 40.6 MB, less than 27.47% of Java online submissions for Capitalize the Title.*/
public class Capitalize_the_Title_2129 {

    public String capitalizeTitle(String title) {
        return Pattern.compile("(\\w)(\\w*)").matcher(title)
                .replaceAll(mg -> mg.group(0).length() > 2 ? mg.group(1).toUpperCase() + mg.group(2).toLowerCase() : mg.group(0).toLowerCase());
    }
}
