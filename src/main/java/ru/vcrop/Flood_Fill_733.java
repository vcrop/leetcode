package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Flood Fill.
        Memory Usage: 43.2 MB, less than 84.18% of Java online submissions for Flood Fill.*/
public class Flood_Fill_733 {

    public void solution(int[][] image, int sr, int sc, int newColor, int oldColor) {
        image[sr][sc] = newColor;
        if (sr != 0 && image[sr - 1][sc] == oldColor) solution(image, sr - 1, sc, newColor, oldColor);
        if (sr != image.length - 1 && image[sr + 1][sc] == oldColor) solution(image, sr + 1, sc, newColor, oldColor);
        if (sc != 0 && image[sr][sc - 1] == oldColor) solution(image, sr, sc - 1, newColor, oldColor);
        if (sc != image[0].length - 1 && image[sr][sc + 1] == oldColor) solution(image, sr, sc + 1, newColor, oldColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor) solution(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

}
