class Solution {
    public String mergeAlternately(String word1, String word2) {
     int length1 = word1.length(), length2 = word2.length();
        char[] resultArr = new char[length1 + length2];
        int pointer1 = 0, pointer2 = 0, resultPointer = 0;
        while (pointer1 < length1 || pointer2 < length2) {
            if (pointer1 < length1) {
                resultArr[resultPointer++] = word1.charAt(pointer1++);
            }
            if (pointer2 < length2) {
                resultArr[resultPointer++] = word2.charAt(pointer2++);
            }
        }
        return new String(resultArr); 
    }
}