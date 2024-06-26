class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int maxLen = 0;
        String ans = "";

        for(int mid = 0; mid < len; mid ++)
        {
            int i = mid - 1;
            int j = mid + 1;
            int curLen = 1; 

            while(i >=0 && j < len && s.charAt(i) == s.charAt(j))
            {
                i--;
                j++;
                curLen+=2;
                
            }
            if(maxLen < curLen)
                {
                    ans = s.substring(i+1,j);
                    maxLen = curLen;
                }
        }

        for(int mid = 0; mid < len - 1; mid ++)
        {
            int i = mid;
            int j = mid + 1;
            int curLen = 0; 

            while(i >=0 && j < len && s.charAt(i) == s.charAt(j))
            {
                i--;
                j++;
                curLen+=2;
                
            }
            if(maxLen < curLen)
                {
                    ans = s.substring(i+1,j);
                    maxLen = curLen;
                }
        }
    return ans;
    }    
}