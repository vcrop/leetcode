package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Sorted Vowel Strings.
        Memory Usage: 41.2 MB, less than 29.06% of Java online submissions for Count Sorted Vowel Strings.*/
public class Count_Sorted_Vowel_Strings_1641 {

    public int countVowelStrings(int n) {

        int[][] array = new int[n + 1][];

        array[1] = new int[]{1, 1, 1, 1, 1};

        for (int i = 2; i <= n; i++) {
            int sum = 0;
            array[i] = new int[5];
            for (int j = 4; j > -1; j--) {
                sum += array[i - 1][j];
                array[i][j] = sum;
            }
        }

        int ret = 0;

        for (int i = 0; i < 5; i++) ret += array[n][i];

        return ret;
    }

}
