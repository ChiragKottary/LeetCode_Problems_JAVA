class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        // Keep index of every element
        TreeMap<Integer, List<Integer>> map = new TreeMap();
        for(int i = 0; i < nums.size(); i++) {
            for(int n : nums.get(i)) {
                if(!map.containsKey(n)) map.put(n, new ArrayList<>());
                map.get(n).add(i);
            }
        }
        
        // Create a sorted array
        List<Integer> list = new ArrayList(map.keySet());
\t\t
        // Sliding window
        int l = 0, r = 0;
        int[] ans = new int[]{ list.get(0), list.get(list.size()-1) };
        int[] cnt = new int[nums.size()];
        while(l < list.size()) {
            // Move right pointer
            while(r < list.size() && !allIn(cnt)) {
                for(int m : map.get(list.get(r))) cnt[m]++;
                r++;
            }
            // Condition match
            if(allIn(cnt) && (list.get(r-1) - list.get(l)) < (ans[1] - ans[0])) {
                ans = new int[]{ list.get(l), list.get(r-1) };
            }
            // Move left pointer
            for(int m : map.get(list.get(l))) cnt[m]--;
            l++;
        }
        return ans;
    }
    private boolean allIn(int[] cnt) {
        for(int c : cnt) {
            if(c == 0) return false;
        }
        return true;
    }
}