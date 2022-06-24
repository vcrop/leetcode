package ru.vcrop;


public class First_Bad_Version_278 {

    static boolean isBadVersion(int i) {
        return true;
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int hi = n;

        while (low < hi) {
            int middle = (hi - low) / 2 + low;
            if (isBadVersion(middle)) hi = middle;
            else low = middle + 1;
        }

        return low;
    }
}
