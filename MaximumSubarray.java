public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxCurrent = nums[0];
        int minCurrent = nums[0];
        // Kadane's Algorithm
        for (int i = 1; i < nums.length; i++) {
            int temp = maxCurrent;
            maxCurrent = Math.max(Math.max(maxCurrent + nums[i], minCurrent + nums[i]), nums[i]);
            minCurrent = Math.min(Math.min(temp + nums[i], minCurrent + nums[i]), nums[i]);

            if (maxCurrent > maxSum){
                maxSum = maxCurrent;
            }
        }
        return maxSum;
    }
}
