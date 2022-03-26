package ru.vcrop;

/*Runtime: 41 ms, faster than 30.09% of Java online submissions for Smallest String With A Given Numeric Value.
        Memory Usage: 67.3 MB, less than 18.41% of Java online submissions for Smallest String With A Given Numeric Value.*/
public class Smallest_String_With_A_Given_Numeric_Value_1663 {

    public String getSmallestString(int n, int k) {
        k -= n;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            int tmp = Math.max(0, k - (n - 1 - i) * 25);
            result.append((char) (tmp + 'a'));
            k -= tmp;
        }
        return result.append((char) (k + 'a')).toString();
    }
}
