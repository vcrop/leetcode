package ru.vcrop;

/*Runtime: 3 ms, faster than 99.22% of Java online submissions for Isomorphic Strings.
        Memory Usage: 42.9 MB, less than 55.49% of Java online submissions for Isomorphic Strings.*/
public class Isomorphic_Strings_205 {

    public boolean isIsomorphic(String s, String t) {
        char[] cs = new char[128];
        char[] ct = new char[128];

        for (int i = 0; i < s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if (cs[ss] == 0 && ct[tt] == 0){
                cs[ss] = tt;
                ct[tt] = ss;
            } else if (cs[ss] != tt || ct[tt] != ss) return false;
        }


        return true;
    }

    public static void main(String[] args) {

        System.out.println(new Isomorphic_Strings_205().isIsomorphic("foo", "bar"));
    }
}
