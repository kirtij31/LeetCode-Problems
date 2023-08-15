class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    //     Arrays.sort(nums);
    //     List<List<Integer>> sol = new ArrayList<>();
    //     List<Integer> list = new ArrayList<Integer>();
    //     permute(sol,list,nums,0);
    //     return sol;
    // }

    // void permute( List<List<Integer>> sol, List<Integer> list, int[] nums, int index){

    //     if(list.size()==nums.length){
    //     sol.add(new ArrayList<>(list));
    //     return;}

    //     for(int i=0;i<nums.length;i++){
    //         if(i!=index && nums[i]==nums[i-1])
    //         continue;
    //         list.add(nums[i]);
    //         permute(sol,list,nums,i);
    //         list.remove(list.size()-1);
    //     }

    // }

     List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
    if(tempList.size() == nums.length){
        list.add(new ArrayList<>(tempList));
    } else{
        for(int i = 0; i < nums.length; i++){
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            used[i] = true; 
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, used);
            used[i] = false; 
            tempList.remove(tempList.size() - 1);
        }
    }
}
}