class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>  h = new HashMap<Integer,Integer>();
        for (int i : tasks)
        {
            if(h.containsKey(i))
            {
                h.put(i, h.get(i)+1);
            }
            else
            {
                h.put(i, 1);
            }
        }
        int rounds = 0;
        for (int key : h.keySet()){
            int r = minRound(h,key);
            if(r==-1){
                return -1;
            }
            rounds+=r;
        }
        return rounds;
    }
    public int minRound(HashMap<Integer,Integer> map , int key){
        int value = map.get(key);
        int minrounds = 0 ; 
        while(value>1){
            if(value%3==0){
                return minrounds + value/3;
            }
            value-=2;
            minrounds++;
        }
        if(value==1){
            return -1;
        }
        return minrounds;
    }
    
}