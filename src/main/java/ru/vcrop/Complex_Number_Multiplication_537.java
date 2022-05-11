package ru.vcrop;

/*Runtime: 7 ms, faster than 49.79% of Java online submissions for Complex Number Multiplication.
        Memory Usage: 40.9 MB, less than 68.94% of Java online submissions for Complex Number Multiplication.*/
public class Complex_Number_Multiplication_537 {

    public String complexNumberMultiply(String num1, String num2) {
        String[] first = num1.split("[+]");
        String[] second = num2.split("[+]");
        int a1 = Integer.parseInt(first[0]);
        int b1 = Integer.parseInt(first[1].substring(0, first[1].length() - 1));
        int a2 = Integer.parseInt(second[0]);
        int b2 = Integer.parseInt(second[1].substring(0, second[1].length() - 1));
        return (a1 * a2 - b1 * b2) + "+" + (a1 * b2 + a2 * b1) + "i";
    }
}
