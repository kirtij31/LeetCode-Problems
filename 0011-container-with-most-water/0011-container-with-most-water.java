class Solution {
    public int maxArea(int[] height) {

        int max_area = Integer.MIN_VALUE;
        int i=0,j=height.length-1;

        while(i<j){
            int left = height[i];
            int right = height[j];

            if(left<=right){
              int area = left*(j-i);
              max_area = Math.max(max_area,area);
              while(height[i]<=left && i<j)
              i++;
            }else{
              int area = right*(j-i);
              max_area = Math.max(max_area,area);
              while(height[j]<=right && i<j)
              j--; 
            }
        }

        return max_area;
    }
}