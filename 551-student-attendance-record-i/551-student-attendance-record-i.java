class Solution {
    public boolean checkRecord(String s) {
     if(s.length()==0)
        {
            return false;
        }
        int c=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='A')
            {
                c++;
            }
            
        }
         for(int i=1; i<s.length()-1; i++)
        {
            if(s.charAt(i-1)=='L' && s.charAt(i)=='L' && s.charAt(i+1)=='L')
            {
                return false;
            }
            
        }
        return c>=2?false:true;
    }
}