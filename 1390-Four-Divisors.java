class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int ele: nums){
            int count = 2;
            int sum = ele+1;
            for(int i =2;count<=4 && i<ele;i++){
                if(ele%i == 0){
                    count++;
                    sum = sum + i;
                }
            }
            if(count == 4){
                ans =ans +sum;
            }
        }
        return ans;
    }
}