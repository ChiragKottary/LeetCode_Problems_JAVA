class Solution {
    public int minPatches(int[] nums, int n) {
        int cost = 0;
        long upper = 1;
        int i = 0;
        while(upper <= n)
        {
            if(i<nums.length && upper  >= nums[i]  )
            {
                upper += nums[i];
                i++;
            }
            else
            {
                upper += upper;
                cost++;   
            }
        }
    return cost;    
    }
}