class Solution {
    public int findTheWinner(int n, int k) {
        int i = 0;
        for(int j =2; j<=n;j++){
            i = (i+k)%j;
        }
        return i+1;
    }
}