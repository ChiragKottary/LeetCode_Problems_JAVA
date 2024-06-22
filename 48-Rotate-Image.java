class Solution {
    public void rotate(int[][] mat) {
        for(int i = 0; i < mat.length;i++ )
        {
            for( int j = i+1; j < mat[0].length; j++ )
            {
                if(i<j){
                int temp  = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
            }
        }
        for(int k=0;k<mat.length;k++){
            int left=0,right=mat.length-1;
            while(left<right){
                int temp=mat[k][left];
                mat[k][left]=mat[k][right];
                mat[k][right]=temp;
                left++;
                right--;
            }
        }    

        
    }

    
}