class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
      
        int l = Math.min(word1.length(),word2.length());
        int i=0;  
        for(i=0;i<l;i++){
            merged = merged + word1.charAt(i) + word2.charAt(i) ;
        }

        if(word1.length()>i)
          merged = merged + word1.substring(i);
        else
          merged = merged + word2.substring(i);

        return merged;
    }
}