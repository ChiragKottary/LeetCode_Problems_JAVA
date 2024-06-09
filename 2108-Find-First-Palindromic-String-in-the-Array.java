class Solution {

    public boolean isPal(String n)
    {
        int start = 0;
        int end = n.length() - 1;

        while(start < end)
        {
            if(n.charAt(start) !=n.charAt(end))
            {
                return false;
            }
        start++;
        end--;    
        }
        return true;
    }


    public String firstPalindrome(String[] words) {

        for(int i = 0; i < words.length; i++)
        {
            if(isPal(words[i]))
            {
                return words[i];
            }
        }
    return "";   
    }
}