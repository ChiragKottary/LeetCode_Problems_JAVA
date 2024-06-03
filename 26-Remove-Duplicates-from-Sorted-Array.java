class Solution {
    public int removeDuplicates(int[] nums) {
        int traversalArr = 0;
        int k = 0;
        int prev = Integer.MIN_VALUE;

        for(;traversalArr < nums.length; traversalArr++)
        {
            int currentElem = nums[traversalArr];

            if(currentElem != prev)
            {
                nums[k] = currentElem;
                k++;
                prev = currentElem;
            }
        }
        return k; 
    }
}