package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Min Cost Climbing Stairs.
        Memory Usage: 41.4 MB, less than 99.08% of Java online submissions for Min Cost Climbing Stairs.*/
public class Min_Cost_Climbing_Stairs_746 {

    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++)
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
