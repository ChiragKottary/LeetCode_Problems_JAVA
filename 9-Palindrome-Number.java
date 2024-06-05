class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int newNum = 0;
        if(x<0)
            return false;
        while (x != 0)
        {
            int lastDigit = x % 10;
            x /= 10;
            newNum = newNum * 10 + lastDigit;
        }
        if(newNum == dup)
        {
            return true;
        }

      return false;  
    }
}