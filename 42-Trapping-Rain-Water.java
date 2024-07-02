class Solution {
    public int trap(int[] arr) {
        int ans = 0;
        int low = 0;
        int high = arr.length - 1;
        int lmax = 0;
        int hmax = 0;

        while( low < high)
        {
            if(arr[low] < arr[high]){
            lmax = Math.max(lmax,arr[low]);
            ans += lmax - arr[low];
            low++;
            }else{
            hmax = Math.max(hmax,arr[high]);
            ans += hmax - arr[high];
            high--; 
            }
            
        }
    return ans;    
    }
}