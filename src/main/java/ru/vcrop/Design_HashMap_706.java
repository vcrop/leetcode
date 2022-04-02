package ru.vcrop;

import java.util.Arrays;

/*Runtime: 56 ms, faster than 34.62% of Java online submissions for Design HashMap.
        Memory Usage: 50.2 MB, less than 84.16% of Java online submissions for Design HashMap.*/
public class Design_HashMap_706 {

    private int[] elms = new int[1_000_001];

    public Design_HashMap_706() {
        Arrays.setAll(elms, n -> -1);
    }

    public void put(int key, int value) {
        elms[key] = value;
    }

    public int get(int key) {
        return elms[key];
    }

    public void remove(int key) {
        elms[key] = -1;
    }
}
