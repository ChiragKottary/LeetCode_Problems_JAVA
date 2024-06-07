class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 ;
        int j = 0;
        int prev = Integer.MIN_VALUE;

        for(;i < nums.length; i++)
        {
            if(nums[i] != prev)
            {
                nums[j] = nums[i];
                j++;
                prev = nums[i];
            }
        }
        return j;
    }
}