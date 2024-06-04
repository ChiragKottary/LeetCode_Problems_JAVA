class Solution {
    public int countDigits(int num) {
        int div = 0;
        int d= num;
        int count = 0;


        while(d > 0)
        {
            div =d % 10;
            d /= 10;
            if(num % div == 0)
            {
                count++;
            } 


        }
        return count;
    }
}