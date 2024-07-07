class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int rem= 0;
        int full=0;
        int ans = numBottles;

        while(numBottles >= numExchange)
        {
            rem = numBottles%numExchange;
            full = numBottles/numExchange;
            ans += full;
            numBottles = full+rem;
        }
    return ans ;   
    }
}