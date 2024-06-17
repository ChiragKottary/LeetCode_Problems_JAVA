class Solution {
    public boolean judgeSquareSum(int c) {
        long s = 0, e = (long) Math.sqrt(c);
        
        while (s <= e) {
            long sumOfSquares = s * s + e * e;
            if (sumOfSquares == c) {
                return true;
            } else if (sumOfSquares > c) {
                e--;
            } else {
                s++;
            }
        }
        
        return false;
    }
}