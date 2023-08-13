class Solution {
     List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
       
        permutations(nums,0,nums.length-1);
        return ans;
    }

    void permutations(int[] nums, int l, int r){
        if(l==r){
        List<Integer> list =  new ArrayList<Integer>();
        for(int i=0;i<=r;i++){
            list.add(nums[i]);
        }
         ans.add(list);
         return;
        }

        for(int i=l;i<=r;i++){
            swap(nums,l,i);
            permutations(nums,l+1,r);
            swap(nums,l,i);
           
        }
    }

    void swap(int[] nums, int l, int i){
        int a = nums[l];
        nums[l] = nums[i];
        nums[i]=a;
    }


}