class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0.0;
        int i=0,j=0;
        for( i=0;i<k;i++){
            sum = sum+nums[i];
        }
        double maxSum = Integer.MIN_VALUE;
        maxSum = Math.max(maxSum,sum);
       
        while(i<nums.length){
            sum = sum+nums[i]-nums[j];
            maxSum = Math.max(maxSum,sum);
            i++;
            j++;
        }

        return maxSum/k;

    }
}