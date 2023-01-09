class Solution {
    public int[] twoSum(int[] numbers, int tgt) {
       int[] a = new int[2];
       int i=0;
       int j=numbers.length-1;
      while(true){
            if(numbers[i]+numbers[j]==tgt){
                a[0]=i+1;
                a[1]=j+1;
                break;
            }
            else if(numbers[i]+numbers[j]>tgt)
                j--;
            else
                i++;
        }
        return a;
    }
}