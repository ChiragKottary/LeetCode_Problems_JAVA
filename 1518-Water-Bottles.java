class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int rem= 0;
        int ans = numBottles;

        while(numBottles >= numExchange)
        {
            rem = numBottles%numExchange;
            numBottles = numBottles/numExchange;
            ans += numBottles;
            numBottles = numBottles+rem;
        }
    return ans ;   
    }
}