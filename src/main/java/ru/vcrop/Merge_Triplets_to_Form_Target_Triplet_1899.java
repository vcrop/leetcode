package ru.vcrop;

/*Runtime: 5 ms, faster than 73.55% of Java online submissions for Merge Triplets to Form Target Triplet.
        Memory Usage: 90.6 MB, less than 86.24% of Java online submissions for Merge Triplets to Form Target Triplet.*/

public class Merge_Triplets_to_Form_Target_Triplet_1899 {

    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean first = false;
        boolean second = false;
        boolean third = false;

        for (int[] t: triplets)
            if (t[0] <= target[0] && t[1] <= target[1] && t[2] <= target[2]) {
                first |= t[0] == target[0];
                second |= t[1] == target[1];
                third |= t[2] == target[2];
            }

        return first && second && third;
    }
}
