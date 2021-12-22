package ru.vcrop;

/*https://leetcode.com/problems/bulls-and-cows/
        Runtime: 10 ms, faster than 36.40% of Java online submissions for Bulls and Cows.
        Memory Usage: 39.3 MB, less than 48.86% of Java online submissions for Bulls and Cows.*/
public class Bulls_and_Cows_299 {

    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;

        int[] srt = new int[26], gss = new int[26];

        for (int i = 0; i < secret.length(); i++)
            if (secret.charAt(i) == guess.charAt(i)) bulls++;
            else {
                srt[secret.charAt(i) - '0']++;
                gss[guess.charAt(i) - '0']++;
            };

        for (int i = 0; i < srt.length; i++)
            cows += Math.min(srt[i], gss[i]);

        return String.format("%sA%sB", bulls, cows);
    }

}
