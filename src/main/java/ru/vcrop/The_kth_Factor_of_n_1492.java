package ru.vcrop;

/*Runtime: 1 ms, faster than 83.83% of Java online submissions for The kth Factor of n.
        Memory Usage: 41.6 MB, less than 20.31% of Java online submissions for The kth Factor of n.*/
public class The_kth_Factor_of_n_1492 {

    public int kthFactor(int n, int k) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                if (++count == k) return i;
        return -1;
    }
}
