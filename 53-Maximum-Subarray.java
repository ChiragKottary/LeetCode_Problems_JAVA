class Solution {
    public int maxSubArray(int[] n) {
        int sum = 0;
        int max = n[0];

        for(int i = 0;i<n.length;i++)
        {
            sum+=n[i];
            if( sum > max)
            {
                max = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return max;
        
    }
}