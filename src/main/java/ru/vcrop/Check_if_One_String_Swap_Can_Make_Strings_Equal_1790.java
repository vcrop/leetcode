package ru.vcrop;

/*Runtime: 1 ms, faster than 81.29% of Java online submissions for Check if One String Swap Can Make Strings Equal.
        Memory Usage: 42.1 MB, less than 56.26% of Java online submissions for Check if One String Swap Can Make Strings Equal.*/
public class Check_if_One_String_Swap_Can_Make_Strings_Equal_1790 {

    public boolean areAlmostEqual(String s1, String s2) {
        int[] chars = new int[256];
        int swap = 0;
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i)]++;
            chars[s2.charAt(i)]--;
            if (s1.charAt(i) != s2.charAt(i))
                if (swap++ > 1) return false;
        };
        for (int i: chars) if (i != 0) return false;
        return true;
    }
}
