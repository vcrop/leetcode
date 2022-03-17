package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Happy Number.
        Memory Usage: 39.4 MB, less than 73.50% of Java online submissions for Happy Number.*/
public class Happy_Number_202 {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (true) {
            slow = sum(slow);
            fast = sum(sum(fast));
            if (slow == 1) return true;
            if (slow == fast) return false;
        }
    }

    private int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
