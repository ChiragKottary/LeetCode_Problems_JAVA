class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int i = 0;

        for(;j < nums.length ; j++)
        {
            if(nums[i] != nums[j])
            {
                nums[++i]= nums[j];
            }
        }
        return i+1;
    }
}