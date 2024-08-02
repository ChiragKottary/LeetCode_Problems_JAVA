class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(\ \);
        int length = arr.length;
        String LastStr = arr[length - 1];

        int n = LastStr.length();
    return n;    
    }
}