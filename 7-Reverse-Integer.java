class Solution {
    public int reverse(int x) {
        long newNum = 0;
        
        while(x != 0)
        {
            int lastNum = x % 10;
            x /= 10;
            newNum = (newNum * 10) + lastNum;

            if (newNum > Integer.MAX_VALUE || newNum < Integer.MIN_VALUE) {
                return 0;
            }
            
        }
      return (int)newNum; 
    }
}