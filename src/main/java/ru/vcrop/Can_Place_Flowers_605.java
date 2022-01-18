package ru.vcrop;

/*https://leetcode.com/problems/can-place-flowers/
        Runtime: 1 ms, faster than 92.17% of Java online submissions for Can Place Flowers.
        Memory Usage: 49.1 MB, less than 31.95% of Java online submissions for Can Place Flowers.*/
public class Can_Place_Flowers_605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) i++;
            else
            if (i + 1 == flowerbed.length || flowerbed[i + 1] != 1) {
                n--;
                i++;
            };
        }
        return n <= 0;
    }
}
