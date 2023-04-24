class Solution {
    public int[] asteroidCollision(int[] ast) {
        if(ast.length<=1) return ast;
        Stack<Integer> ans = new Stack<>();
        for(int i=0; i<ast.length; i++)
        {
            if(ast[i]>=0)
            {
                ans.push(ast[i]);
            }
            else
            {
                while(!ans.isEmpty() && (ans.peek() > 0 && Math.abs(ans.peek()) < Math.abs(ast[i])))
                {
                    ans.pop();
                }
                if(ans.isEmpty() || ans.peek() < 0 )
                {
                    ans.add(ast[i]);
                }
                else if(ans.peek()==Math.abs(ast[i]))
                {
                    ans.pop();
                }
            }
        }
        int[] a = new int[ans.size()];
        for (int i = ans.size()-1; i >=0; i--) {
            a[i] = ans.pop();
        }
        return a;
    }
}