class Solution {
    public void sortColors(int[] n) {
        int i = 0;
        int j = 0;
        int k = n.length - 1;

        while(j <= k)
        {
            int ch = n[j];
            switch(ch)
            {
                case 0:
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                    i++;
                    j++;
                    break;
                case 1:
                    j++;
                    break;
                case 2:
                    temp = n[k];
                    n[k] = n[j];
                    n[j] = temp;
                    k--;       
            }
        }
}
}
