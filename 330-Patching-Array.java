class Solution {
    public int minPatches(int[] nums, int n) {
        int cost = 0;
        long upper = 0;
        int i = 0;
        while(upper < n)
        {
            if(i<nums.length && upper+1 >= nums[i])
            {
                upper += nums[i];
                i++;
            }else
            {
                upper += (upper+1);
                cost++;   
            }
        }
    return cost;    
    }
}