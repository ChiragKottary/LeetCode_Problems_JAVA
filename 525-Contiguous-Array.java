class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>(); 
        int sum = 0;
        int maxlen = 0;
        map.put(0,-1);
        for(int i = 0;i< nums.length;i++){
            if(nums[i] == 0)
                sum++;
            if(nums[i] == 1)
                sum--;
        if(map.containsKey(sum))
        {
            maxlen = Math.max(maxlen,i - map.get(sum));
        }
        else
            map.put(sum,i);

        }
        return maxlen;
    }
}