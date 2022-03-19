package ru.vcrop;

/*Runtime: 3 ms, faster than 92.61% of Java online submissions for Valid Anagram.
        Memory Usage: 44.2 MB, less than 34.82% of Java online submissions for Valid Anagram.*/
public class Valid_Anagram_242 {

    public boolean isAnagram(String s, String t) {
        int[] letters = new int[26];
        for (char c: s.toCharArray()) letters[c - 'a']++;
        for (char c: t.toCharArray()) letters[c - 'a']--;
        for (int i: letters) if (i != 0) return false;
        return true;
    }
}
