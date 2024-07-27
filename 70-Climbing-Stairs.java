class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 0 || n == 1) return 1;

        if(map.get(n) != null)
            return map.get(n);

        int ClimbOneStairs = climbStairs(n - 1);
        int ClimbTwostairs = climbStairs(n - 2);

        int totalWays = ClimbOneStairs + ClimbTwostairs;
        map.put(n,totalWays);
        return totalWays;
    }
}