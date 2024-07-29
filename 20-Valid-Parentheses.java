class Solution {
    public boolean isValid(String s) {
        Stack<Character> exp = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '('||ch == '{'||ch == '['){
                exp.push(ch);
            }else if(ch == ')'||ch == '}'||ch == ']'){
                if(exp.isEmpty())
                    return false;
                if(ch == ')' && exp.peek() =='('){
                    exp.pop();
                }else if(ch == '}' && exp.peek() =='{'){
                    exp.pop();
                }else if(ch == ']' && exp.peek() =='['){
                    exp.pop();
                }else{
                    return false;
                }
            }
        }
        if(exp.isEmpty()){
                return true;
            }
            
    return false;    
    }
}