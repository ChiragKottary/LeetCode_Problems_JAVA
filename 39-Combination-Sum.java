class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public void helper(int[] candidates,int index,int target,List<Integer> combi)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(combi));
            return;
        }
        if(candidates.length == index || target < 0)
        {
            return;
        }
        helper(candidates,index+1,target,combi);

        combi.add(candidates[index]);
        helper(candidates,index,target - candidates[index],combi);
        combi.remove(combi.size() -1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,0,target,new ArrayList<>());
        return ans;
    }
}