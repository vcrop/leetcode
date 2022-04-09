package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

public class Integer_to_English_Words_273 {

    Map<Integer,String> map;

    {
        map = new HashMap<>();
        map.put(0, "");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
    }

    private String convert(int num) {
        return map.getOrDefault(num,
                (num >= 1e2 ? (map.get(num / 100) + " Hundred ") : "") +
                        map.getOrDefault(num % 100, map.get(num / 10 % 10 * 10) + " " + map.get(num % 10))
        );
    }

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        String result = "";
        if (num >= 1e9) result += convert(num / 1_000_000_000) + " Billion ";
        num %= 1_000_000_000;
        if (num >= 1e6) result += convert(num / 1_000_000) + " Million ";
        num %= 1_000_000;
        if (num >= 1e3) result += convert(num / 1_000) + " Thousand ";
        num %= 1000;
        return (result + convert(num)).trim().replaceAll("\\s{2,}", " ");
    }
}
