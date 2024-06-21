class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int zeroSum = 0;
        int grumpSum = 0;
        int maxGrumpSum = 0;
        for(int i = 0;i < customers.length; i++)
        {
            if(grumpy[i]==0)
            {
                zeroSum += customers[i];
            }

            if(i < minutes)
            {
                grumpSum += (grumpy[i]==1 ? customers[i] : 0 );
            }
            else
            {
                grumpSum += (grumpy[i]==1 ? customers[i] : 0 ) -
                            (grumpy[i - minutes]==1 ? customers[i - minutes] : 0 );
            }
          maxGrumpSum =  Math.max(maxGrumpSum,grumpSum);
        }
     return zeroSum+maxGrumpSum;    
    }
}