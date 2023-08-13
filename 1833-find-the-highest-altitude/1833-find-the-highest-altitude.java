class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxalt = 0;

        for(int i=0;i<gain.length;i++){
            sum +=gain[i];
            gain[i]=sum;
            maxalt = Math.max(sum,maxalt);
        }
      
        return maxalt;
    }
}