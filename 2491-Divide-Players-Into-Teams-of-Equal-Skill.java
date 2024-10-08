class Solution {
    public long dividePlayers(int[] skill) {
        int len=skill.length;
        if(len == 2) return skill[0]*skill[1];
        int teams=len/2, sum=0;
        for(int i=0; i<len; i++){
            sum += skill[i];
        }
        int teamSkill = sum/teams;
        if(sum%teams != 0) return -1;
        long chem=0;
        Arrays.sort(skill);
        int low=0, high=len-1;
        while(low<high){
            int teammate1 = skill[low];
            int teammate2 = skill[high];
            int tempSum = teammate1 + teammate2;
            if(tempSum != teamSkill) return -1;
            chem = chem + (teammate1*teammate2);
            low++;
            high--;
        }
        return chem;
    }
}