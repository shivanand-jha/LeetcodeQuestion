class Solution {
    public int[] twoSum(int[] numbers, int target) {
    if(numbers==null || numbers.length==0) return new int[]{};
	int low =0,high=numbers.length-1;
	while(low<high){
		int sum=numbers[high]+numbers[low];
		if(sum==target)return new int[]{low+1,high+1};
		if(target<sum)high--;
		else if(target>sum)low++;
	}
	return new int[]{};
    }
}