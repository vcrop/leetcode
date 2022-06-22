package ru.vcrop;

public class Longest_Palindrome_409 {

    public int longestPalindrome(String s) {
        int[] letters = new int[128];

        for (char ch: s.toCharArray()) letters[ch]++;

        boolean even = false;
        int sum = 0;

        for (int l: letters) {
            if (l % 2 == 1) even = true;
            sum += l / 2 * 2;
        }

        return sum + (even ? 1 : 0);
    }
}
