class Solution {
    public int removeDuplicates(int[] nums) {
        
       int count=1;
       int j=1;
       

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
            count++;
            nums[j]=nums[i];
            j++;
            }
        }
        return count;

    }
}