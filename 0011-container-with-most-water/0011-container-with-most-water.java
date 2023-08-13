class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e = height.length-1;
        int maxArea=0;
        while(s<e){
            int area= (e-s)*(Math.min(height[s],height[e]));
            maxArea = Math.max(maxArea,area);
            if(height[s]<height[e]){
                s++;
            }else if(height[e]<height[s]){
              e--;
            }else{
                s++;
                e--;
            }
        }

        return maxArea;
    }
}