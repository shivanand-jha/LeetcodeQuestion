class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int h=s.length-1;
        while(l<h)
        {
            char temp = s[h];
            s[h--] = s[l];
            s[l++] = temp;
        }
    }
}