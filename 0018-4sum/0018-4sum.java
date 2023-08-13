class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> retval = new ArrayList<>();
        

        // sort
        Arrays.sort(nums);
                    
        for(int i = 0; i < nums.length; i++){
            //avoid duplicates
            if(i > 0 && nums[i - 1] == nums[i]){
                continue;
            }
            
            for(int j = i + 1; j < nums.length; j++){
                //avoid duplicates
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                //init pointers
                int left = j + 1;
                int right = nums.length - 1;
                // target = num[i] + nums[j] + nums[left] + nums[right]
                long rest = (long) target - nums[i] - nums[j];
                while(left < right){
                    if(nums[left] + nums[right] > rest){
                        right --;
                    }else if(nums[left] + nums[right] < rest){
                        left ++;
                    }else{
                        //correct!
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        retval.add(list);

                        //move pointers
                        right --;  
                        left ++;
                        
                        //avoid duplicates
                        while(left < right && nums[left] == nums[left - 1]){
                            left ++;
                        }
                        while(left < right && nums[right] == nums[right + 1]){
                            right--;
                        }
                    }

                }
                
            }
            
        }
        return retval;
    }
}