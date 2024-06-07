class Solution {
    public int countSubstrings(String s) {
        int totalNoOfPal = 0;
        int len = s.length();

        for(int mid = 0;mid < len; mid++)
        {
            int i = mid - 1;
            int j = mid + 1;
            totalNoOfPal++;
            while(i >= 0 && j < len && s.charAt(i) == s.charAt(j))
            {
                i --;
                j ++;
                totalNoOfPal++;
            }
        }
        for(int mid = 0;mid < len; mid++)
        {
            int i = mid;
            int j = mid + 1;
            while(i >= 0 && j < len && s.charAt(i) == s.charAt(j))
            {
                i --;
                j ++;
                totalNoOfPal++;
            }
        }
    return totalNoOfPal;
    }
}