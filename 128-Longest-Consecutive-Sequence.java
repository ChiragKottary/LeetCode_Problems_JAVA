class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i : nums){
            map.add(i);
        }
        int maxlen=0;

        
        for(int elem: nums)
        {
            if(!map.contains(elem - 1)){
                int count = 1;
                while(map.contains(elem + count))
                {
                    count++;  
                }
                maxlen = Math.max(maxlen,count);   
            }
        }
    return maxlen;    
    }
}