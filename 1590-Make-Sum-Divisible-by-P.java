class Solution {
    public int minSubarray(int[] nums, int p) {
        var sum = 0L;
        var preSum = new long[nums.length + 1];
         for (int i = 1; i <= nums.length; ++i) {
            sum += nums[i - 1];
            preSum[i] = sum;
        }

        if (sum % p == 0) {
            return 0;
        }

        for (int j = 1; j < nums.length; ++j) {
            for (int k = 0; k <= nums.length - j; ++k) {
                if ((sum - (preSum[k + j] - preSum[k])) % p == 0) {
                    return j;                    
                }
            }
        }

        return -1;
    }
}