class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:nums){
            pq.add(val);
        }
        long score=0L;
        for(int i=0;i<k;i++){
            int val=pq.poll();
            score+=val;
            val=(int)(Math.ceil(val/3.0));
            pq.offer(val);
        }
        return score;

    }
}