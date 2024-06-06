class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = 0;
        int SumOfSome = 0;
        for(int i=0 ; i < nums.length ; i++)
        {
            totalSum= totalSum + i +1;
            SumOfSome+=nums[i];
        }
     return totalSum - SumOfSome;
    }
}