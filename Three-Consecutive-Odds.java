class Solution 
{
    public boolean threeConsecutiveOdds(int[] arr) 
    {
        // Step 1: Traverse array from 0 to length - 3
        for (int i = 0; i < arr.length - 2; i++) 
        {
            // Step 2: Check if three consecutive numbers are all odd
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) 
            {
                // Step 3: Return true if condition met
                return true; 
            }
        }

        // Step 4: No such triplet found
        return false; 
    }
}