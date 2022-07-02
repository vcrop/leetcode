package ru.vcrop;

import java.util.Arrays;

public class Maximum_Area_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts_1465 {

    public int maxArea(int h, int w, int[] hor, int[] vert) {
        int[] hor_d = new int[vert.length + 1];
        int[] vert_d = new int[hor.length + 1];

        Arrays.sort(hor);
        Arrays.sort(vert);

        for (int i = 1; i < vert.length; i++)
            hor_d[i] = vert[i] - vert[i - 1];
        hor_d[0] = vert[0];
        hor_d[hor_d.length - 1] = w - vert[vert.length - 1];

        for (int i = 1; i < hor.length; i++)
            vert_d[i] = hor[i] - hor[i - 1];
        vert_d[0] = hor[0];
        vert_d[vert_d.length - 1] = h - hor[hor.length - 1];

        Arrays.sort(hor_d);
        Arrays.sort(vert_d);

        return (int) ((((long) hor_d[hor_d.length - 1]) * ((long) vert_d[vert_d.length - 1])) % 1000000007L);
    }
}
