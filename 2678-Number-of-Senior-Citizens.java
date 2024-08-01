class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(int i = 0; i < details.length;i++){
            String str = details[i];
            char num = str.charAt(11);
            char Zero = str.charAt(12);
           // System.out.println(num);
            if(num > '6' || (num == '6' && Zero > '0')){
                count++;
            }
        }
    return count;
    }
}