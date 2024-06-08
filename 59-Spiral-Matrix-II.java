class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        

        
        int k = 0;
        int left = 0 ;
        int right = n - 1;
        int up = 0;
        int down = n - 1;

        int count = 0;

        while( count < (n*n))
        {
            for(int col = left; col <= right; col++)
            {
                arr[up][col] = ++k;
                count++;
            }
            //traversal from up to down
            for(int row = up + 1; row <= down; row++)
            {
                arr[row][right] = ++k;
                count++;
            }

            if(up != down)
            {
            //traversal from right to left
            for(int col = right - 1; col >=left; col--)
            {
                arr[down][col] = ++k;
                count++;
            }
            }
            if(left != right)
            {
            //traversal from down to up
            for(int row = down - 1; row >up; row--)
            {
                arr[row][left] = ++k;
                count++;
            }
            }
            left++;
            right--;
            up++;
            down--;
        }
        

     return arr;   
    }
}