class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> found = new HashSet<>();
        for (int n : nums) {
            if (!found.add(n)) {
                return true;
            }
        }
        return false;
    }
}