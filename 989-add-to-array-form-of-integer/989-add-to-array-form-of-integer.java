class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
     LinkedList<Integer> result = new LinkedList<>();//linked list of type integer so that we can add at first position of list
        int len = num.length - 1;//length of array 
        while(len >= 0 || k != 0){ 
            if(len >= 0){ //
                k += num[len--]; //Directly add to digit of k
            }
            result.addFirst(k % 10);//add at first
            k /= 10;
        }   
        return result;
    }
}