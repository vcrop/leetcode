package ru.vcrop;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Find_Pivot_Index_724 {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;

        int sum_mid = 0;

        for (int i = 0; i < nums.length; i++)
            if (sum - nums[i] - sum_mid == sum_mid) return i;
            else sum_mid += nums[i];

        return -1;
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        return new String(bytes, charset);
    }
}
