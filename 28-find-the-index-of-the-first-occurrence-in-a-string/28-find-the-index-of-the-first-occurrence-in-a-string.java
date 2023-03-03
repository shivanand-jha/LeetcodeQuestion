class Solution {
    public int strStr(String h, String n) {
    for (int i = 0; ; i++) {
    for (int j = 0; ; j++) {
      if (j == n.length()) return i;
      if (i + j == h.length()) return -1;
      if (n.charAt(j) != h.charAt(i + j)) break; 
    }
  }
 }
}