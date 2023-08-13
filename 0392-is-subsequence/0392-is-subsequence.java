class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int j = 0;
        if(s.length()>t.length())
        return false;
        
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
        }
        return j == s.length();
    }
}