class Solution {
    public int[] searchRange(int[] nums, int target) {

      int ans[]={-1,-1};
      ans[0] = lowerBound(nums,target);

      if ( ans[0]!=-1)
      ans[1]=upperBound(nums,target);

      return ans;
       
    }

    int lowerBound(int[] nums, int target ){
        int n= nums.length;
        int left = 0;
        int right=n-1;
        int ans = -1; 

         while(left<=right){

            int mid = left+(right-left)/2;

            if(nums[mid]==target){
             ans = mid;
               right = mid -1 ;
            }else if(nums[mid]<target)
             left=mid+1;
             else
             right=mid-1;           
        }
        return ans;
    }

    int upperBound(int[] nums, int target ){
        int n= nums.length;
        int left = 0;
        int right=n-1;
        int ans = -1;

         while(left<=right){

            int mid = left+(right-left)/2;

            if(nums[mid]==target ){
                ans = mid;
               left = mid +1 ;
            }else if(nums[mid]<target)
             left=mid+1;
             else
             right=mid-1;           
        }
        return ans;
    }
}