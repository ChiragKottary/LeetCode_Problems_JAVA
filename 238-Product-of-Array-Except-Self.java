class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int leftProduct = 1;
        ans[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--)
        {
            ans[i]= ans[i+1]*nums[i];
        }

        for(int i = 0; i < nums.length;i++){
            int rightProduct = (i == n-1)? 1 : ans[i+1];
            ans[i] = leftProduct * rightProduct;
            leftProduct*=nums[i];
        }
        
        return ans;
    }
}