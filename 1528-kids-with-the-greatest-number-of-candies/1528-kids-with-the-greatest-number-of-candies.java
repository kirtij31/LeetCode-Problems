class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       
        int max = candies[0];
        for(int i=1;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }

        List<Boolean> result = new ArrayList<Boolean>();
        for(int candy : candies){
            result.add(candy+extraCandies >= max);
        }

        return result;

    }
}