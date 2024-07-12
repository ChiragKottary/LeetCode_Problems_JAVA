class Solution {
    public int maximumGain(String s, int x, int y) {
        
        int acnt = 0;
        int bcnt = 0;
        int lesser = Math.min(x, y);
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'b') {
                result += Math.min(acnt, bcnt) * lesser;
                acnt = 0;
                bcnt = 0;
            } else if (c == 'a') {
                if (x < y && bcnt > 0) {
                    bcnt--;
                    result += y;
                } else {
                    acnt++;
                }
            } else {
                if (x > y && acnt > 0) {
                    acnt--;
                    result += x;
                } else {
                    bcnt++;
                };
            }
        }
        
        result += Math.min(acnt, bcnt) * lesser;
        
        return result;
    }
}