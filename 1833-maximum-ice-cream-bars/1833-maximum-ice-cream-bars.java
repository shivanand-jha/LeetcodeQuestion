class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs); 
        for(int i =0; i<costs.length; i++)
        {
            if(costs[i]<=coins)
                coins -=costs[i];
            else
                return i;
        }
        return costs.length;
    }
}