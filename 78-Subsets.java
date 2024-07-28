class Solution {
    public List<List<Integer>> ans =new ArrayList<>();
    public void helper(int[] nums , int index,List<Integer> Combi){
        if(index == nums.length ){
            ans.add(new ArrayList<>(Combi));
            return;
        }
        //Dont include in the list
        helper(nums,index+1,Combi);
        
        //Element include in the list
        Combi.add(nums[index]);
        helper(nums,index+1,Combi);
        Combi.remove(Combi.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        helper(nums,0,list);
     return ans;   
    }
}