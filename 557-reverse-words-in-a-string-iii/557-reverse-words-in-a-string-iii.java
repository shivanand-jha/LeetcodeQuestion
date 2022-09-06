class Solution {
    public String reverseWords(String s) {
        String[] a ;
        a = s.split(" ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=reverse(a[i]);
        }
        String ans="";
         for (int i = 0; i < a.length; i++) {
            ans+=a[i];
            if (i<a.length-1) ans+=" ";
        }

        return ans;
    }
    public String reverse(String s)
    {
        char[] a = s.toCharArray();
        int l=0;
        int h=a.length-1;
        while(l<=h){
            char temp = a[l];
            a[l] = a[h];
            a[h] = temp;
            l++;
            h--;
        }
        String ans = "";
        for (char c : a) {
            ans += c;
        }
        return ans;
    }
}