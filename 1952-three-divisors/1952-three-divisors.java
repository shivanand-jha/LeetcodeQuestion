class Solution {
    public boolean isThree(int n) {
        int c=1;
        for (int i = 1; i <= (n/2); i++)
        {
            if (n % i == 0)
            {
                c++;
            }
        }
        return c==3;
    }
}