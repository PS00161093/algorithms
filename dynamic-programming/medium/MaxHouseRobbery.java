// https://leetcode.com/problems/house-robber/

class MaxRobbery {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }

        int[] cache = new int[len];
        cache[0] = nums[0];
        cache[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < len; i++) {
            cache[i] = Math.max(cache[i - 1], cache[i - 2] + nums[i]);
        }

        return cache[len - 1];
    }
}
