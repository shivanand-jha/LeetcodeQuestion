class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null)return 0;
      return haystack.indexOf(needle);
    }
}