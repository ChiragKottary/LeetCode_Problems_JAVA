class Solution {
    public int minOperations(String[] logs) {
        Stack<String> s = new Stack<>();

        for(String str: logs)
        {
            if(str.equals("../"))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }else if(!str.equals("./"))
            {
                s.push(str);
            }
            
        }
        
        return s.size();
    }
}