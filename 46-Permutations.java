class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void swap(int[] nums , int i ,int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }
    public void helper(int[] nums ,int index ){

        if(index == nums.length){
                List<Integer> list = new ArrayList<>();
                for(int x : nums){
                    list.add(x);
                }
                ans.add(list);
                return;
        }else{
            for(int i = index ; i<nums.length ; i++){
                swap(nums, i ,index);
                helper(nums,index+1);
                swap(nums, i ,index);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        helper(nums,0);
    return ans;    
    }
}