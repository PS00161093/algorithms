// https://leetcode.com/problems/min-cost-climbing-stairs/

class MinimuCostClimbStairs {
    public int minCostClimbingStairs(int[] cost) {
        // +1 extra because treat the top floor as the step to reach.
        int len = cost.length + 1;

        if (len == 0)
            return 0;

        int[] cache = new int[len];

        // minimum cost of reaching step 0 and step 1 is 0
        cache[0] = 0;
        cache[1] = 0;

        // the recurrence relation - minimumCost[i] = min(minimumCost[i - 1] + cost[i - 1], minimumCost[i - 2] + cost[i - 2])
        for (int i = 2; i < len; i++) {
            cache[i] = Math.min(cache[i - 1] + cost[i - 1], cache[i - 2] + cost[i - 2]);
        }

        return cache[cache.length - 1];
    }
}
