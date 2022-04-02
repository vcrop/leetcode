package ru.vcrop;

/*Runtime: 9 ms, faster than 75.34% of Java online submissions for Valid Palindrome II.
        Memory Usage: 54.6 MB, less than 41.50% of Java online submissions for Valid Palindrome II.*/
public class Valid_Palindrome_II_680 {

    private boolean isPalindrome(String s, boolean nomatch) {
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                if (nomatch) return false;
                return isPalindrome(s.substring(low, high), true) ||
                        isPalindrome(s.substring(low + 1, high + 1), true);
            }
            low++;
            high--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        return isPalindrome(s, false);
    }
}
