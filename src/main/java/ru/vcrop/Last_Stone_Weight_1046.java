package ru.vcrop;

/*Runtime: 2 ms, faster than 76.58% of Java online submissions for Last Stone Weight.
        Memory Usage: 41.8 MB, less than 34.21% of Java online submissions for Last Stone Weight.*/
public class Last_Stone_Weight_1046 {

    public int lastStoneWeight(int[] stones) {
        int[] weights = new int[1001];

        for (int i: stones) weights[i]++;

        for (int i = 1000; i > -1; i--) {
            if (weights[i] % 2 != 0) {
                for (int j = i - 1; j > -1; j--)
                    if (weights[j] != 0) {
                        weights[j]--;
                        weights[i] = 0;
                        weights[i - j]++;
                        break;
                    }
            } else weights[i] = 0;
        }

        for (int i = 0; i < 1001; i++)
            if (weights[i] % 2 != 0) return i;

        return 0;
    }
}
