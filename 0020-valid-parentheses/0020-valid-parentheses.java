class Solution {
    public boolean isValid(String s) {
         int length = s.length();
        Stack<Character> stack = new Stack();
        char curr;
        for(int i=0;i<length;i++)
        {
            curr = s.charAt(i);
            if(curr=='{' || curr=='(' || curr=='['){
                stack.push(curr);
            }
            if(curr==']'){
                if(stack.empty() || stack.peek()!='['){
                    return false;
                }
                else stack.pop();
            }
            if(curr=='}'){
                if(stack.empty() || stack.peek()!='{'){
                    return false;
                }
                else stack.pop();
            }
            if(curr==')'){
                if(stack.empty() || stack.peek()!='('){
                    return false;
                }
                else stack.pop();
            }
        }
        return stack.empty();
    }
}