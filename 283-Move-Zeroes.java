class Solution {
    public void moveZeroes(int[] n) {
        int left=0;
        for(int right = 0;right< n.length; right++)
        {
            if(n[right] !=0 )
            {
                int temp = n[right];
                n[right] = n[left];
                n[left] = temp;
                left++;
            }
        }


        }
        
    }
