public class Solution {
    public string AddSpaces(string s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
    int j  = 0;
    int lastIndex = s.Length -1;
    for (int i = 0;i < s.Length ;i++)
    {
        if(i == spaces[j])
        {
            sb.Append(" ");
            j++;
            if( j >spaces.Length-1 ){
                j = 0;
            }
        }
        sb.Append(s[i]);
    }
    return sb.ToString();
    }
}